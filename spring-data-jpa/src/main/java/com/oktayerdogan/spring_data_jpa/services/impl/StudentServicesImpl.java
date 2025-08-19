package com.oktayerdogan.spring_data_jpa.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oktayerdogan.spring_data_jpa.entites.Student;
import com.oktayerdogan.spring_data_jpa.repository.StudentRepository;
import com.oktayerdogan.spring_data_jpa.services.IStudentServices;

@Service
public class StudentServicesImpl implements IStudentServices {

    @Autowired
    private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
