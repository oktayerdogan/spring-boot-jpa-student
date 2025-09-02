package com.oktayerdogan.spring_data_jpa.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oktayerdogan.spring_data_jpa.controller.IEmployeeController;
import com.oktayerdogan.spring_data_jpa.dto.DtoEmployee;
import com.oktayerdogan.spring_data_jpa.services.IEmployeeService;

@RestController
@RequestMapping("rest/api/employee")
public class EmployeeControllerImpl implements IEmployeeController{

    @Autowired
    private IEmployeeService employeeService;

    @Override
    @GetMapping(path = "/list")
    public List<DtoEmployee> findAllEmployees() {
        return employeeService.findAllEmployees();
    }

}
