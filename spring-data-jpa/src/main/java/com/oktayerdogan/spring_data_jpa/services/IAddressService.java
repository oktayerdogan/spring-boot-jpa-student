package com.oktayerdogan.spring_data_jpa.services;

import com.oktayerdogan.spring_data_jpa.dto.DtoAddress;

public interface IAddressService {

    public DtoAddress finAddressById(long id);
}
