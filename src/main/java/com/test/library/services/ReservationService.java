package com.test.library.services;

import com.test.library.model.Reservation;
import com.test.library.repository.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepo reservationRepo;

    public Reservation save(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

}
