package com.test.library.model;

import lombok.*;

import java.util.Date;
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Rent {
    private Long id;
    private Long cuntomerId;
    private Long volumeId;
    private Long acceptedById;
    private Date rentDate;
    private Date untillDate;
}
