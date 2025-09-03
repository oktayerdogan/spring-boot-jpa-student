package com.oktayerdogan.spring_data_jpa.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oktayerdogan.spring_data_jpa.dto.DtoCourse;
import com.oktayerdogan.spring_data_jpa.dto.DtoStudent;
import com.oktayerdogan.spring_data_jpa.dto.DtoStudentIU;
import com.oktayerdogan.spring_data_jpa.entites.Course;
import com.oktayerdogan.spring_data_jpa.entites.Student;
import com.oktayerdogan.spring_data_jpa.repository.StudentRepository;
import com.oktayerdogan.spring_data_jpa.services.IStudentServices;


@Service
public class StudentServicesImpl implements IStudentServices {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {
        DtoStudent response = new DtoStudent();
        Student student = new Student();
        BeanUtils.copyProperties(dtoStudentIU, student);  

        Student dbStudent = studentRepository.save(student);
        BeanUtils.copyProperties(dbStudent,response);
        return response;
    }

   @Override
   public List<DtoStudent> getAllStudents(){
        List<DtoStudent> dtoList = new ArrayList<>();

        List<Student> studentList = studentRepository.findAllStudents();
        for (Student student : studentList) {
            DtoStudent dto = new DtoStudent();
            BeanUtils.copyProperties(student,dto);
            dtoList.add(dto);
        }
        return dtoList;
   }

   @Override
   public DtoStudent getStudentById(Integer id) {
        DtoStudent dtoStudent = new DtoStudent();
        Optional<Student> optional = studentRepository.findById(id);
        if(optional.isEmpty()){
            return null;
        }
        Student dbStudent = optional.get();
        BeanUtils.copyProperties(dbStudent,dtoStudent);

        if(dbStudent.getCourses()!=null && !dbStudent.getCourses().isEmpty()){
            for (Course course : dbStudent.getCourses()) {
                DtoCourse dtoCourse = new DtoCourse();
                BeanUtils.copyProperties(course,dtoCourse);

                dtoStudent.getCourses().add(dtoCourse);
            }
        }
        return dtoStudent;
   }

   @Override
   public void deleteStudent(Integer id) {
        Optional<Student> optional = studentRepository.findById(id);
        if(optional.isPresent()){
            studentRepository.delete(optional.get());
        }
   }

   @Override
   public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU) {
        DtoStudent dto = new DtoStudent();
        Optional<Student> optional = studentRepository.findById(id);
        if(optional.isPresent()){
            Student dbStudent = optional.get();

            dbStudent.setFirstName(dtoStudentIU.getFirstName());
            dbStudent.setLastName(dtoStudentIU.getLastName());
            dbStudent.setBirthOfDate(dtoStudentIU.getBirthOfDate());
            dbStudent.setEmail(dtoStudentIU.getEmail());
            dbStudent.setGobek(dtoStudentIU.getGobek());

            Student updatedStudent = studentRepository.save(dbStudent);
            BeanUtils.copyProperties(updatedStudent,dto);

            return dto;
        }
        return null;
   } 
}