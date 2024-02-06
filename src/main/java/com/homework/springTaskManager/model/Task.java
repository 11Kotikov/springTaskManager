package com.homework.springTaskManager.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

/*
 * Класс для хранения данных о задачах
 */
@Entity
@Table (name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String taskTitle;
    @Enumerated(EnumType.STRING) // для хранения значения в БД в виде строки
//    @Column(columnDefinition = "varchar(20) default 'NEW'")
    private TaskStatus taskStatus;
    private LocalDateTime createdDate;

    public Task() {
        this.createdDate = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
