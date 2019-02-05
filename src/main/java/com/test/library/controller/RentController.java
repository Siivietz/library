package com.test.library.controller;

import com.test.library.model.Rent;
import com.test.library.services.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RentController {

    @Autowired
    RentService rentService;

    @RequestMapping(value = "/rent")
    public RedirectView rentReleased(Rent rent){
        rentService.save(rent);
        return new RedirectView("admin");
    }
}
