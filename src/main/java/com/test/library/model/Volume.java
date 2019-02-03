package com.test.library.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Volume {

    @Id
    private Long id;
    private Long releaseId;
    private String hardCover;
    private Date added;
    private Date modified;
}
