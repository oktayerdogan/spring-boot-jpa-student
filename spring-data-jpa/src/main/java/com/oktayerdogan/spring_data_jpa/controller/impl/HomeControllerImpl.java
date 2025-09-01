package com.oktayerdogan.spring_data_jpa.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.oktayerdogan.spring_data_jpa.controller.IHomeController;
import com.oktayerdogan.spring_data_jpa.dto.DtoHome;
import com.oktayerdogan.spring_data_jpa.services.IHomeService;

@RestController
@RequestMapping("/rest/api/home")
public class HomeControllerImpl implements IHomeController{

    @Autowired
    private IHomeService homeService;

    @GetMapping(path = "/{id}")
    @Override
    public DtoHome findHomeById(@PathVariable(name="id") long id) {
        return homeService.findHomeById(id);
    }

}
