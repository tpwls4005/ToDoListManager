package com.zerobase.todo.listmanager.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "User")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "UserID")
  private Long userId;

  @Column(name = "Username", nullable = false)
  private String username;

  @Column(name = "Password", nullable = false)
  private String password;

  @Column(name = "Email")
  private String email;

  @Column(name = "RegistrationDate")
  @Temporal(TemporalType.DATE)
  private Date registrationDate;

  // Getter and Setter methods
}