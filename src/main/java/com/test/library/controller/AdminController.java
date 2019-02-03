package com.test.library.controller;

import com.test.library.model.Book;
import com.test.library.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.swing.*;

@Controller
public class AdminController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/admin")
    public String getAdminPage() {
        return "admin";
    }
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getMainPage(Model model) {
        model.addAttribute("books", bookService.findAll());

        return "admin";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.POST)
    public void addBook(Book book) {
        bookService.save(book);
    }

    @DeleteMapping(value = "/admin")
    public void deleteBook(Long id) {
        bookService.deleteBook(id);
    }
}
