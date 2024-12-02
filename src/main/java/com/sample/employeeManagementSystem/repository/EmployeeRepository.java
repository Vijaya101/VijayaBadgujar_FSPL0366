package com.sample.employeeManagementSystem.repository;

import com.sample.employeeManagementSystem.enetity.Employee1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee1,Long> {
}
