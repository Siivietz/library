package com.test.library.controller;

import com.test.library.model.Book;
import com.test.library.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;


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

    @RequestMapping(value = "/admin/add", method = RequestMethod.POST)
    public RedirectView addBook(Book book) {
        bookService.save(book);
        return new RedirectView("/admin");
    }

    @RequestMapping(value = "/admin/del", method = RequestMethod.POST)
    public RedirectView deleteBookById(Long id) {
        bookService.deleteBookById(id);
        return new RedirectView("/admin");

    }
}
