package com.test.library.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Author {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    @OneToMany
    private List<Book> authorBooks;
}
