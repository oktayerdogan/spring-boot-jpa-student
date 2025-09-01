package com.oktayerdogan.spring_data_jpa.controller;

import com.oktayerdogan.spring_data_jpa.dto.DtoHome;

public interface IHomeController {

    public DtoHome findHomeById(long id);
}
