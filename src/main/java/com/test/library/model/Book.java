package com.test.library.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Long isbn;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author_id;
    private Date added;
    private Date modified;
    @OneToMany
    private List<Released> released;

}
