package com.zerobase.todo.listmanager.Controller;

import com.zerobase.todo.listmanager.Entity.Task;
import com.zerobase.todo.listmanager.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

  private final TaskService taskService;

  @Autowired
  public TaskController(TaskService taskService) {
    this.taskService = taskService;
  }

  @GetMapping
  public List<Task> getAllTasks() {
    return taskService.getAllTasks();
  }

  @GetMapping("/{taskId}")
  public Task getTaskById(@PathVariable Long taskId) {
    return taskService.getTaskById(taskId);
  }

  @PostMapping
  public Task saveTask(@RequestBody Task task) {
    return taskService.saveTask(task);
  }

  @DeleteMapping("/{taskId}")
  public void deleteTask(@PathVariable Long taskId) {
    taskService.deleteTask(taskId);
  }
}