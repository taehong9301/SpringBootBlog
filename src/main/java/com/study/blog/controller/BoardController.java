package com.study.blog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class BoardController {

  // @AuthenticationPrincipal PrincipalDetail principalDetail
  // 위 코드를 통해 세션에 저장된 사용자 정보를 가져올 수 있다.
  @GetMapping({"", "/"})
  public String index() {
    return "index";
  }

  @GetMapping("/board/saveForm")
  public String boardSaveForm() {
    return "board/saveForm";
  }

  @GetMapping("/board/updateForm")
  public String boardUpdateForm() {
    return "board/updateForm";
  }
}
