package com.study.blog.service;

import com.study.blog.model.RoleType;
import com.study.blog.model.User;
import com.study.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService {

  @Autowired private UserRepository userRepository;

  @Transactional
  public User join(User user) {
    user.setRole(RoleType.USER);
    return userRepository.save(user);
  }

  @Transactional(readOnly = true) // select 할때 트랜잭션 시작, 서비스 종료 후 트랜잭션 종료
  public User login(User user) {
    Optional<User> optionalUser =
        userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    return optionalUser.orElseThrow(() -> new RuntimeException("Not found user"));
  }
}
