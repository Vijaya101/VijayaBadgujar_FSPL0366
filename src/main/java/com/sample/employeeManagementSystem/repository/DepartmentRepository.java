package com.sample.employeeManagementSystem.repository;

import com.sample.employeeManagementSystem.enetity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
