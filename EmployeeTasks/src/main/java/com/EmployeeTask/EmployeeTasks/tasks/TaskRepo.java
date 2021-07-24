package com.EmployeeTask.EmployeeTasks.tasks;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task,Long> {
void deleteTaskBytaskId(Long taskId);
}
