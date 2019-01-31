package com.test.library.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "autorzy")
public class Author {
@Id
    private Long authorId;

    private String authorName;
}
