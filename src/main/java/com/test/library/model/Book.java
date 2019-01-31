package com.test.library.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "ksiazki")
public class Book {

    public void Book() {
    }

    @Id
    @Column(name="id_ksiazka")
    private Long bookId;
    @Column(name="tytul")
    private String title;
    @Column(name="isbn")
    private Long isbn;
//    private Date added;
////    private Date modified;
////    private Long authorId;
////    private boolean rent;


}
