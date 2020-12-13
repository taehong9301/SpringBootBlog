package com.study.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

  @GetMapping("loginForm")
  public String loginForm() {
    return "user/loginForm";
  }

  @GetMapping("joinForm")
  public String joinForm() {
    return "user/joinForm";
  }

  @PostMapping("login")
  public String login() {
    return "";
  }

  @PostMapping("join")
  public String join() {
    return "";
  }
}
