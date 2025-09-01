package com.oktayerdogan.spring_data_jpa.controller;

import com.oktayerdogan.spring_data_jpa.dto.DtoAddress;

public interface IAddressController {

    public DtoAddress finAddressById(long id);
}
