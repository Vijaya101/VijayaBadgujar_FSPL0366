package com.sample.employeeManagementSystem.repository;

import com.sample.employeeManagementSystem.enetity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignationRepository extends JpaRepository<Designation,Long> {
}
