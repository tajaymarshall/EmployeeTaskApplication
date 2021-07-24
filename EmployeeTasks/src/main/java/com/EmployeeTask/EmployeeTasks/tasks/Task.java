package com.EmployeeTask.EmployeeTasks.tasks;

import com.EmployeeTask.EmployeeTasks.employees.Employee;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Task implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
    private String name;
    private String description;
    private LocalDate dueDate;

    private String status;


    @ManyToMany(mappedBy = "employeeTasks")
    private Set<Employee> taskEmployees = new HashSet<>();

    public Task(Long taskId, String name, String description, LocalDate dueDate, String status, Set<Employee> taskEmployees) {
        this.taskId = taskId;
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
        this.taskEmployees = taskEmployees;
    }

    public Task(){}

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Employee> getTaskEmployees() {
        return taskEmployees;
    }



    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", status='" + status + '\'' +
                ", taskEmployees=" + taskEmployees +
                '}';
    }
}
