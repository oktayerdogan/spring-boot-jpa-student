package com.oktayerdogan.spring_data_jpa.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oktayerdogan.spring_data_jpa.controller.IAddressController;
import com.oktayerdogan.spring_data_jpa.dto.DtoAddress;
import com.oktayerdogan.spring_data_jpa.services.IAddressService;

@RestController
@RequestMapping("/rest/api/address")
public class AddressControllerImpl implements IAddressController{

    @Autowired
    private IAddressService addressService;

    @GetMapping(path = "/list/{id}")
    @Override
    public DtoAddress finAddressById(@PathVariable(name = "id") long id) {
        return addressService.finAddressById(id);
    }

}
