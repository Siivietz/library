package com.test.library.model;

import lombok.*;

import java.util.Date;

@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
@Setter(value = AccessLevel.PUBLIC)
@Getter(value = AccessLevel.PUBLIC)
public class Worker {
    private Long id;
    private String login;
    private Date added;
    private Date modified;
}
