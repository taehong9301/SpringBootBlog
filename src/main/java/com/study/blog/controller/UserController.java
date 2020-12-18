package com.study.blog.controller;

import com.study.blog.config.auth.PrincipalDetail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class UserController {

  @GetMapping("auth/loginForm")
  public String loginForm() {
    return "auth/loginForm";
  }

  @GetMapping("auth/joinForm")
  public String joinForm() {
    return "auth/joinForm";
  }

  @GetMapping("user/updateForm")
  public String userUpdateForm(@AuthenticationPrincipal PrincipalDetail principalDetail) {
    return "user/updateForm";
  }
}
