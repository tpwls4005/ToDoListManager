package com.zerobase.todo.listmanager.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Task")
public class Task {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "TaskID")
  private Long taskId;

  @Column(name = "Title", nullable = false)
  private String title;

  @Column(name = "Description", columnDefinition = "TEXT")
  private String description;

  @Column(name = "PriorityID")
  private Integer priorityId;

  @Column(name = "DueDate")
  @Temporal(TemporalType.DATE)
  private Date dueDate;

  @Column(name = "IsComplete")
  private Boolean isComplete;

  @Column(name = "CreatedDate")
  @Temporal(TemporalType.DATE)
  private Date createdDate;

  // Getter and Setter methods
}


