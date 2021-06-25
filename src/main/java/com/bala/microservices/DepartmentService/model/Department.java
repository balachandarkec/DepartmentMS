package com.bala.microservices.DepartmentService.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue
    private int departmentId;
    private String departmentName;
    private String address;
    private Double budget;

}
