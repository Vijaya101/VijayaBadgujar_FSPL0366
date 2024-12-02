package com.sample.employeeManagementSystem.enetity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@Entity
@Data
@Table(name = "employee")
public class Employee1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long employeeId;

    private String employeeName;
   private  String employeeLastName;
    private Integer employeeMoNumber;
    private String employeeAddress;
    private Integer DateofJoining;
    private String email;

    private boolean isActive;
    private String createdby;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updateDate;


}

