package com.oktayerdogan.spring_data_jpa.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oktayerdogan.spring_data_jpa.controller.IStudentController;
import com.oktayerdogan.spring_data_jpa.entites.Student;
import com.oktayerdogan.spring_data_jpa.services.IStudentServices;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController {

    @Autowired
    private IStudentServices studentService;

    @PostMapping(path = "/save")
    @Override
    public Student saveStudent(@RequestBody Student student) {
       return studentService.saveStudent(student);
    }	
}
