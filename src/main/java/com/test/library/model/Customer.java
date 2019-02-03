package com.test.library.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Customer {

    @Id
    private Long id;
    private String name;
    private String birthDate;
    private String pesel;
    private String city;
    private String street;
    private String zipcode;
    private Date added;
    private Date modified;
    private String password;
}
