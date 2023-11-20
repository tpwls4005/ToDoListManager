package com.zerobase.todo.listmanager.Service;

import com.zerobase.todo.listmanager.Entity.Task;
import com.zerobase.todo.listmanager.Repository.TaskRepository;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {

  private final TaskRepository taskRepository;

  @Autowired
  public TaskService(TaskRepository taskRepository) {
    this.taskRepository = taskRepository;
  }

  // 작업 목록 조회
  public List<Task> getAllTasks() {
    return taskRepository.findAll();
  }

  // 작업 저장
  public Task saveTask(Task task) {
    return taskRepository.save(task);
  }

  // 작업 조회
  public Task getTaskById(Long taskId) {
    return taskRepository.findById(taskId).orElse(null);
  }

  // 작업 삭제
  public void deleteTask(Long taskId) {
    taskRepository.deleteById(taskId);
  }
  public List<Task> getTasksByPriority(Integer priorityId) {
    return taskRepository.findByPriorityId(priorityId);
  }

  public List<Task> getAllTasksSortedByDueDate() {
    return taskRepository.findAllByOrderByDueDate();
  }

  public List<Task> getAllTasksSortedByCreatedDate() {
    return taskRepository.findAllByOrderByCreatedDate();
  }

  public List<Task> getTasksByDueDateBefore(Date dueDate) {
    return taskRepository.findByDueDateBefore(dueDate);
  }

  public List<Task> getTasksByDueDateAfter(Date dueDate) {
    return taskRepository.findByDueDateAfter(dueDate);
  }
}