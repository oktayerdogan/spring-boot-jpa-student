package com.oktayerdogan.spring_data_jpa.exception;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiError<T>{

    private String id;
    
    private Date errorTime;

    private T errors;
}
