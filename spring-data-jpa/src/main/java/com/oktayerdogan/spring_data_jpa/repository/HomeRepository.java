package com.oktayerdogan.spring_data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oktayerdogan.spring_data_jpa.entites.Home;

@Repository
public interface HomeRepository extends JpaRepository<Home,Long>{

}
