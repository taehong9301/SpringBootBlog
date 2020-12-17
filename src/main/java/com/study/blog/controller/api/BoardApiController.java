package com.study.blog.controller.api;

import com.study.blog.config.auth.PrincipalDetail;
import com.study.blog.dto.ResponseDto;
import com.study.blog.model.Board;
import com.study.blog.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api")
public class BoardApiController {

  @Autowired private BoardService boardService;

  @PostMapping("board")
  public ResponseDto<Integer> board(
      @RequestBody Board board, @AuthenticationPrincipal PrincipalDetail principalDetail) {
    log.info(board.toString());
    boardService.write(board, principalDetail.getUser());
    return new ResponseDto<>(HttpStatus.OK.value(), 1);
  }
}
