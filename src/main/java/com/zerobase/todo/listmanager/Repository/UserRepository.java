package com.zerobase.todo.listmanager.Repository;

import com.zerobase.todo.listmanager.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}