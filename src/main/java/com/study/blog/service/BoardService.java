package com.study.blog.service;

import com.study.blog.model.Board;
import com.study.blog.model.User;
import com.study.blog.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

  public List<Board> getBoardList() {
    return boardRepository.findAll();
  }

  public Page<Board> getBoardList(Pageable pageable) {
    return boardRepository.findAll(pageable);
  }

  public Board getBoard(long id) {
    return boardRepository
        .findById(id)
        .orElseThrow(() -> new IllegalArgumentException("해당 글은 존재하지 않습니다."));
  }
}
