package com.study.blog.service;

import com.study.blog.model.RoleType;
import com.study.blog.model.User;
import com.study.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

  @Autowired private UserRepository userRepository;

  @Transactional
  public User join(User user) {
    user.setRole(RoleType.USER);
    return userRepository.save(user);
  }
}
