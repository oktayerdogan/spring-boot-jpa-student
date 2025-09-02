package com.oktayerdogan.spring_data_jpa.controller;

import java.util.List;

import com.oktayerdogan.spring_data_jpa.dto.DtoEmployee;

public interface IEmployeeController {

    public List<DtoEmployee> findAllEmployees();
}
