package com.oktayerdogan.spring_data_jpa.controller;

import java.util.List;

import com.oktayerdogan.spring_data_jpa.dto.DtoStudent;
import com.oktayerdogan.spring_data_jpa.dto.DtoStudentIU;
import com.oktayerdogan.spring_data_jpa.entites.Student;

public interface IStudentController {

    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(Integer id);

    public void deleteStudent(Integer id);

    public DtoStudent updateStudent(Integer id,DtoStudentIU dtoStudentIU);
}
