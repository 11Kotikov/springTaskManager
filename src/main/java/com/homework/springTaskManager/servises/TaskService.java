package com.homework.springTaskManager.servises;

import com.homework.springTaskManager.model.Task;
import com.homework.springTaskManager.model.TaskStatus;
import com.homework.springTaskManager.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
Класс для работы с задачами
 */

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    /*
    Метод для поиска задач по статусу
     */
    public List<Task> findTasksByStatus(TaskStatus status) {
        return taskRepository.findByTaskStatus(status);
    }


    // Метод для создания новой задачи
    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    // Метод для получения всех задач
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }


    // Метод для удаления задачи по ID
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
