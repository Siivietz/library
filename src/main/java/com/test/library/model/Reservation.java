package com.test.library.model;

import lombok.Data;

import javax.persistence.Id;

@Data
public class Reservation {
    @Id
    private Long id;
    private Long bookId;
    private Long userId;
    private boolean isReserved;

}
