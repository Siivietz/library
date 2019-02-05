package com.test.library.controller;

import com.test.library.model.Released;
import com.test.library.services.ReleasedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class AdminController {

    @Autowired
    private ReleasedService releasedService;

    @RequestMapping("/admin")
    public String getAdminPage() {
        return "admin";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getMainPage(Model model) {
        model.addAttribute("released", releasedService.findAll());
        return "admin";
    }

    @RequestMapping(value = "/admin/add", method = RequestMethod.POST)
    public RedirectView addReleased(Released released) {
        releasedService.save(released);
        return new RedirectView("/admin");
    }

    @RequestMapping(value = "/admin/del", method = RequestMethod.POST)
    public RedirectView deleteReleasedById(Long id) {
        releasedService.deleteReleasedById(id);
        return new RedirectView("/admin");

    }
}
