package com.oktayerdogan.spring_data_jpa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoEmployee {

    private long id;

    private String name;

    private DtoDepartment department;
}
