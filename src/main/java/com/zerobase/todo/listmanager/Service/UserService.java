package com.zerobase.todo.listmanager.Service;

import com.zerobase.todo.listmanager.Entity.User;
import com.zerobase.todo.listmanager.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

  private final UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  // 사용자 목록 조회
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  // 사용자 저장
  public User saveUser(User user) {
    return userRepository.save(user);
  }

  // 사용자 조회
  public User getUserById(Long userId) {
    return userRepository.findById(userId).orElse(null);
  }

  // 사용자 삭제
  public void deleteUser(Long userId) {
    userRepository.deleteById(userId);
  }
}
