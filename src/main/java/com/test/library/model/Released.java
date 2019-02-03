package com.test.library.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class Released {
    @Id
    private Long id;
    private Long year;
    private String city;
    private String name;
    private LocalDate added;
    private LocalDate modified;
    private Long bookId;
}