package com.oktayerdogan.spring_data_jpa.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oktayerdogan.spring_data_jpa.dto.DtoAddress;
import com.oktayerdogan.spring_data_jpa.dto.DtoCustomer;
import com.oktayerdogan.spring_data_jpa.entites.Address;
import com.oktayerdogan.spring_data_jpa.repository.AddressRepository;
import com.oktayerdogan.spring_data_jpa.services.IAddressService;

@Service
public class AddressServiceImpl implements IAddressService{

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public DtoAddress finAddressById(long id) {

        DtoAddress dtoAddress = new DtoAddress();

        Optional<Address> optional = addressRepository.findById(id);
        if(optional.isEmpty()){
            return null;
        }

        Address address = optional.get();      
        BeanUtils.copyProperties(address, dtoAddress);

        DtoCustomer dtoCustomer = new DtoCustomer();
        dtoCustomer.setId(address.getCustomer().getId());
        dtoCustomer.setName(address.getCustomer().getName());

        // dtoCustomer.setAddress(dtoAddress);

        dtoAddress.setCustomer(dtoCustomer);

        return dtoAddress;
    }

    
}
