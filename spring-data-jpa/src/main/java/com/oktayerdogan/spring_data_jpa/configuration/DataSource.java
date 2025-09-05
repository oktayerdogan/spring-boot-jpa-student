package com.oktayerdogan.spring_data_jpa.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataSource {

    private String url;

    private String username;

    private String password;
}
