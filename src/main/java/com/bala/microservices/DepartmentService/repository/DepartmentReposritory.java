package com.bala.microservices.DepartmentService.repository;

import com.bala.microservices.DepartmentService.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentReposritory extends JpaRepository<Department,Integer> {
    Department findByDepartmentId(int id);
}
