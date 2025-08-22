package com.oktayerdogan.spring_data_jpa.services.impl;

import java.lang.annotation.Retention;
import java.util.List;
import java.util.Optional;

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

   @Override
   public List<Student> getAllStudents(){
    return studentRepository.findAll();
   }

   @Override
   public Student getStudentById(Integer id) {
    Optional<Student> optional = studentRepository.findById(id);
    
    if(optional.isPresent()){
        return optional.get();
    }
    return null;
   }

   @Override
   public void deleteStudent(Integer id) {
        Student dbStudent = getStudentById(id);
        if(dbStudent!=null){
            studentRepository.delete(dbStudent);
        }
   }

   @Override
   public Student updateStudent(Integer id, Student updateStudent) {
        Student dbStudent = getStudentById(id);
        if(dbStudent!=null){
            dbStudent.setFirstName(updateStudent.getFirstName());
            dbStudent.setLastName(updateStudent.getLastName());
            dbStudent.setBirthOfDate(updateStudent.getBirthOfDate());

            studentRepository.save(dbStudent);
        }
        return null;
   } 
   
   
}
