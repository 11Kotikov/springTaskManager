package com.homework.springTaskManager.repositories;

import com.homework.springTaskManager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository <Task, Long> {
}
