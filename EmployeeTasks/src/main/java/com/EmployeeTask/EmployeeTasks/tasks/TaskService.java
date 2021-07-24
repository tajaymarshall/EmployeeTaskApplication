package com.EmployeeTask.EmployeeTasks.tasks;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class TaskService {
    private final TaskRepo taskRepo;

    @Autowired
    public TaskService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    public Task addTask(Task task){

        return taskRepo.save(task);
    }

    public List<Task> findAllTasks(){
        return taskRepo.findAll();
    }

    public Task updateTask(Task task){
        return taskRepo.save(task);
    }

@Transactional
    public void deleteTask(Long taskId){
        taskRepo.deleteTaskBytaskId(taskId);
    }
}
