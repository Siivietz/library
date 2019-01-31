package com.test.library.model;

import lombok.*;

import java.util.Date;

@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Volume {
    private Long id;
    private Long releaseId;
    private String hardCover;
    private Date added;
    private Date modified;
}
