package com.study.blog.controller.api;

import com.study.blog.dto.ResponseDto;
import com.study.blog.model.User;
import com.study.blog.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Slf4j
@RestController
@RequestMapping("api")
public class UserApiController {

  @Autowired private UserService userService;

  @Autowired private HttpSession session;

  @PostMapping("user")
  public @ResponseBody ResponseDto<User> user(@RequestBody User user) {
    try {
      return new ResponseDto<>(HttpStatus.OK.value(), userService.join(user));
    } catch (Exception e) {
      return new ResponseDto<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), null);
    }
  }

  @PostMapping("user/login")
  public @ResponseBody ResponseDto<Integer> userLogin(@RequestBody User user) {
    try {
      User principal = userService.login(user);
      session.setAttribute("principal", principal);
      return new ResponseDto<>(HttpStatus.OK.value(), 1);
    } catch (Exception e) {
      return new ResponseDto<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), null);
    }
  }
}
