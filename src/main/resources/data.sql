-- Priority 테이블 데이터 추가
INSERT INTO Priority (PriorityName) VALUES ('High');
INSERT INTO Priority (PriorityName) VALUES ('Medium');
INSERT INTO Priority (PriorityName) VALUES ('Low');

-- Label 테이블 데이터 추가
INSERT INTO Label (LabelName) VALUES ('Work');
INSERT INTO Label (LabelName) VALUES ('Personal');

-- User 테이블 데이터 추가
INSERT INTO User (Username, Password, Email, RegistrationDate) VALUES ('user1', 'password1', 'user1@example.com', '2023-01-01');
INSERT INTO User (Username, Password, Email, RegistrationDate) VALUES ('user2', 'password2', 'user2@example.com', '2023-01-02');

-- Task 테이블 데이터 추가
INSERT INTO Task (Title, Description, PriorityID, DueDate, IsComplete, CreatedDate)
VALUES ('Task 1', 'Description 1', 1, '2023-01-10', false, '2023-01-03');
INSERT INTO Task (Title, Description, PriorityID, DueDate, IsComplete, CreatedDate)
VALUES ('Task 2', 'Description 2', 2, '2023-01-15', false, '2023-01-04');
INSERT INTO Task (Title, Description, PriorityID, DueDate, IsComplete, CreatedDate)
VALUES ('Task 3', 'Description 3', 3, '2023-01-20', false, '2023-01-05');

-- Notification 테이블 데이터 추가
INSERT INTO Notification (TaskID, SendDateTime, Content) VALUES (1, '2023-01-08 12:00:00', 'Reminder for Task 1');
INSERT INTO Notification (TaskID, SendDateTime, Content) VALUES (2, '2023-01-14 15:00:00', 'Reminder for Task 2');

-- UserTask 테이블 데이터 추가
INSERT INTO UserTask (UserID, TaskID) VALUES (1, 1);
INSERT INTO UserTask (UserID, TaskID) VALUES (2, 2);

-- TaskLabel 테이블 데이터 추가
INSERT INTO TaskLabel (TaskID, LabelID) VALUES (1, 1);
INSERT INTO TaskLabel (TaskID, LabelID) VALUES (2, 2);
