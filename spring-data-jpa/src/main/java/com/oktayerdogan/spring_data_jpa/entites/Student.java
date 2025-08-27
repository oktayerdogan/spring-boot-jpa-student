package com.oktayerdogan.spring_data_jpa.entites;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "birth_of_date",nullable = true)
    private Date birthOfDate;

    @Column(name = "email",nullable = false)
    private String email;
 
    @Column(name = "gobek",nullable = false,columnDefinition = "varchar(255) default 'BELİRTİLMEDİ'")
    private String gobek;

    @Column(name = "tckn",nullable = false,columnDefinition = "varchar(255) default 'tckgirmengerek'")
    private String tckn;
}
