package com.study.blog.controller;

import com.study.blog.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class BoardController {

  @Autowired private BoardService boardService;

  // @AuthenticationPrincipal PrincipalDetail principalDetail
  // 위 코드를 통해 세션에 저장된 사용자 정보를 가져올 수 있다.
  @GetMapping({"", "/"})
  public String index(
      Model model,
      @PageableDefault(size = 3, sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {
    model.addAttribute("boards", boardService.getBoardList(pageable));
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
