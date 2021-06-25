package com.bala.microservices.DepartmentService.controller;

import com.bala.microservices.DepartmentService.model.Department;
import com.bala.microservices.DepartmentService.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api/department")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department dept){
        log.info("Inside Department Controller#SaveDepartment method");
        return service.saveDepartment(dept);
    }


    @GetMapping("/{did}") // api/department/13
    public Department findDepartment(@PathVariable("did") int id ){
        log.info("Inside Department Controller#findDepartment method");
        return service.findByDepartmentId(id);
    }






}
