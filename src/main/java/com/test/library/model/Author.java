package com.test.library.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Author {
    @Id
    private Long id;

    private String name;
}
