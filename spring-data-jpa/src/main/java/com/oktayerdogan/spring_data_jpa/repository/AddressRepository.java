package com.oktayerdogan.spring_data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oktayerdogan.spring_data_jpa.entites.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {

}
