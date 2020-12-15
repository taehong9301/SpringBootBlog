package com.study.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// 아래 3개는 보통 한 묶음으로 사용됨
@Configuration // IoC 등록 (빈 설정)
@EnableWebSecurity // 시큐리티 필터가 등록된다 (시큐리티 활성화)
@EnableGlobalMethodSecurity(prePostEnabled = true) // 특정 주소로 접그하면, 권한 및 인증을 미리 체크
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Bean // IoC 등록
  public BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Override
  public void configure(WebSecurity web) throws Exception {
    web.ignoring().antMatchers("resources/**");
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.csrf()
        .disable() // csrf 토큰 비활성화 (테스트시)
        .authorizeRequests()
        // 회원가입, 로그인을 위한 URL은 누구나 접근 가능
        .antMatchers("/", "/auth/**", "/js/**", "/css/**", "/images/**")
        .permitAll()
        // 그 외의 URL은 인증을 해야만 접근 가능
        .anyRequest()
        .authenticated()
        .and()
        // 로그인 설정
        .formLogin()
        .loginPage("/auth/loginForm")
        .permitAll()
        .loginProcessingUrl("/auth/login")
        .permitAll()
        .and()
        // 로그아웃 설정
        .logout()
        .logoutUrl("/logout")
        .permitAll();
  }
}
