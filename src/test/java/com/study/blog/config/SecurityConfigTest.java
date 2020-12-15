package com.study.blog.config;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Slf4j
class SecurityConfigTest {

  @Test
  void encryptPassword() {
    String encPassword = new BCryptPasswordEncoder().encode("1234");
    log.info(encPassword);
  }
}
