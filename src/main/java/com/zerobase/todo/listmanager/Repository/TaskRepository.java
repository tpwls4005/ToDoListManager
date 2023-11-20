package com.zerobase.todo.listmanager.Repository;
import com.zerobase.todo.listmanager.Entity.Task;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

  List<Task> findByPriorityId(Integer priorityId);

  List<Task> findAllByOrderByDueDate();

  List<Task> findAllByOrderByCreatedDate();

  List<Task> findByDueDateBefore(Date dueDate);

  List<Task> findByDueDateAfter(Date dueDate);
}