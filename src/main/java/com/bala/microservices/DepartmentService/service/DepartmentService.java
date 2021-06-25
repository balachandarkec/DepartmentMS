package com.bala.microservices.DepartmentService.service;

import com.bala.microservices.DepartmentService.model.Department;
import com.bala.microservices.DepartmentService.repository.DepartmentReposritory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentReposritory repo;

    public Department saveDepartment(Department dept){
        log.info("Inside Department Save method...");
        return repo.save(dept);
    }


    public Department findByDepartmentId(int id){
        log.info("Inside findByDepartment method.....");
        return repo.findByDepartmentId(id);
    }

}
