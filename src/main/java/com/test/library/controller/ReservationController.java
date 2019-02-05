package com.test.library.controller;

import com.test.library.model.Reservation;
import com.test.library.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReservationController {
    @Autowired
    ReservationService reservationService;


    @RequestMapping(value = "/reserve")
    public RedirectView reserveReleased(Reservation reservation) {
        reservationService.save(reservation);
        return new RedirectView("admin");
    }
}
