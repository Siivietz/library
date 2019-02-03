package com.test.library.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Rent {

    @Id
    private Long id;
    private Long cuntomerId;
    private Long volumeId;
    private Long acceptedById;
    private Date rentDate;
    private Date untillDate;
}
