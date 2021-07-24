package com.EmployeeTask.EmployeeTasks.employees;

import com.EmployeeTask.EmployeeTasks.tasks.Task;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;
    private String name;
    private String department;

    @ManyToMany
    @JoinTable(
            name="employeeTask",
            joinColumns = @JoinColumn(name= "empId"),
            inverseJoinColumns = @JoinColumn(name="taskId")
    )
    private Set<Task> employeeTasks = new HashSet<>();


    public Employee(Long empId, String name, String department, Set<Task> employeeTasks) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.employeeTasks = employeeTasks;
    }

    public Employee(){}

    public Set<Task> getEmployeeTasks() {
        return employeeTasks;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", employeeTasks=" + employeeTasks +
                '}';
    }
}
