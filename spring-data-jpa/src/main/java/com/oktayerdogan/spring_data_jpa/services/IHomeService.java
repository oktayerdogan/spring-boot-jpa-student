package com.oktayerdogan.spring_data_jpa.services;

import com.oktayerdogan.spring_data_jpa.dto.DtoHome;

public interface IHomeService {

    public DtoHome findHomeById(long id);
}
