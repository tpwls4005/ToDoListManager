package com.zerobase.todo.listmanager.Repository;
import com.zerobase.todo.listmanager.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}