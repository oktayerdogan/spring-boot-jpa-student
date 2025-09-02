package com.oktayerdogan.spring_data_jpa.services;

import java.util.List;

import com.oktayerdogan.spring_data_jpa.dto.DtoEmployee;

public interface IEmployeeService {

    public List<DtoEmployee> findAllEmployees();
}
