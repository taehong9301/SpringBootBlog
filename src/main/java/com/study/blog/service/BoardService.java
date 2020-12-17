package com.study.blog.service;

import com.study.blog.model.Board;
import com.study.blog.model.User;
import com.study.blog.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BoardService {

  @Autowired private BoardRepository boardRepository;

  @Transactional
  public Board write(Board board, User user) {
    board.setCount(0);
    board.setUser(user);
    final Board savedBoard = boardRepository.save(board);
    return savedBoard;
  }
}
