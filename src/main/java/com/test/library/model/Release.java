package com.test.library.model;

import lombok.*;

import java.util.Date;

@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Release {
    private Long id;
    private Long year;
    private String city;
    private String name;
    private Date added;
    private Date modified;
    private Long bookId;
}
