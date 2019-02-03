package com.test.library.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Worker {

    @Id
    private Long id;
    private String login;
    private Date added;
    private Date modified;
}
