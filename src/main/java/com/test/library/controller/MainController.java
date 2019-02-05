package com.test.library.controller;

import com.test.library.services.ReleasedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
    @Autowired
    private ReleasedService releasedService;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String getMainPage(Model model) {
        model.addAttribute("released", releasedService.findAll());
        return "admin";
    }

    @RequestMapping(value = "/main", method = RequestMethod.POST)
    public String getSearchResult(@RequestParam Long releasedId, Model model) {
        model.addAttribute("released", releasedService.findAllByReleasedId(releasedId));

        return "admin";
    }
}
