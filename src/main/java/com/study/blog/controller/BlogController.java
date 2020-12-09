package com.study.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

  // 스프링이 com.study.blog 패키지 이하를 스캔하여
  // 모든 파일을 메모리에 new 하진 않고,
  // 특정 어노테이션이 붙어있는 클래스 파일들을 new 하여 IoC 스프링 컨테이너에서 관리 해 줌

  @GetMapping({"", "/"})
  public String hello() {
    return "Hello World";
  }
}
