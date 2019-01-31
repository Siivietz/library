package com.test.library.model;

import lombok.*;

import java.util.Date;

@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Customer {
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
