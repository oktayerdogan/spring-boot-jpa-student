package com.oktayerdogan.spring_data_jpa.services;

import com.oktayerdogan.spring_data_jpa.dto.DtoCustomer;

public interface ICustomerService {

    public DtoCustomer findCustomerById(Long id);
}
