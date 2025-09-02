package com.oktayerdogan.spring_data_jpa.dto;

import java.sql.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {

    @NotEmpty(message = "firstname alanı boş bırakılamaz")
    @Size(min = 3,max = 10,message = "firstname alanı 3 ile 10 karakter arasında olmalıdır.")
    private String firstName;

    @Size(min = 3,max = 20)
    private String lastName;

    private Date birthOfDate;

    @NotBlank(message = "Email boş olamaz")
    @Email(message = "Geçerli bir email giriniz")
    private String email;

    @NotBlank(message = "göbekadı boş geçemez boş olamaz")
    private String gobek;

    @NotBlank(message = "tckn boş geçemez boş olamaz")
    @Size(min = 11, max = 11)
    private String tckn;
}
