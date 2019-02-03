package com.test.library.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Book {
    @Id
    private Long id;
    private String title;
    private Long isbn;
    private Date added;
    private Date modified;
    private Long author_id;


}
