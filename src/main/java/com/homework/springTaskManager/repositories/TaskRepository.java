package com.homework.springTaskManager.repositories;

import com.homework.springTaskManager.model.Task;
import com.homework.springTaskManager.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/*
Интерфейс для работы с тасками в БД.
 */

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByTaskStatus(TaskStatus taskStatus);
}
