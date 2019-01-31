package com.test.library.controller;

import com.test.library.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private BookService bookService = new BookService();
    @RequestMapping("/main")
    public String getMainPage(Model model){

        model.addAllAttributes(bookService.getAllBooks());
        return "main";
    }
}
