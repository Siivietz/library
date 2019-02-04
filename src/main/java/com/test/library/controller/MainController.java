package com.test.library.controller;

import com.test.library.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String getMainPage(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "main";
    }

    @RequestMapping(value = "/main", method = RequestMethod.POST)
    public String getSearchResult(@RequestParam String title, Model model) {
        model.addAttribute("books", bookService.findAllByTitle(title));

        return "main";
    }
}
