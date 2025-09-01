package com.oktayerdogan.spring_data_jpa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoAddress {

    private long id;

    private String description;

    private DtoCustomer customer;
}
