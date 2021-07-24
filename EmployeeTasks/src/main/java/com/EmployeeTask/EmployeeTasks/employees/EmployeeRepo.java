package com.EmployeeTask.EmployeeTasks.employees;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
void deleteEmployeeByempId(Long empId);
}
