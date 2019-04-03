package com.test.library.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Released {
    @Id
    @GeneratedValue
    private Long id;
    private Long year;
    private String city;
    private String name;
    private LocalDate added;
    private LocalDate modified;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book bookId;
}