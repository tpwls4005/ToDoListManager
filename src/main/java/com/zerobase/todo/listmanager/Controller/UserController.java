package com.zerobase.todo.listmanager.Controller;

import com.zerobase.todo.listmanager.Entity.User;
import com.zerobase.todo.listmanager.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping
  public List<User> getAllUsers() {
    return userService.getAllUsers();
  }

  @GetMapping("/{userId}")
  public User getUserById(@PathVariable Long userId) {
    return userService.getUserById(userId);
  }

  @PostMapping
  public User saveUser(@RequestBody User user) {
    return userService.saveUser(user);
  }

  @DeleteMapping("/{userId}")
  public void deleteUser(@PathVariable Long userId) {
    userService.deleteUser(userId);
  }
}