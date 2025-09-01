package com.oktayerdogan.spring_data_jpa.controller;

import com.oktayerdogan.spring_data_jpa.dto.DtoCustomer;

public interface ICustomerController {

    public DtoCustomer findCustomerById(Long id);
    
}
