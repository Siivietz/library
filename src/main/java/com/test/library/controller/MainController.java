package com.test.library.controller;

import com.test.library.model.Book;
import com.test.library.model.Released;
import com.test.library.services.BookService;
import com.test.library.services.ReleasedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MainController {
    @Autowired
    private ReleasedService releasedService;
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String getMainPage(Model model) {
        model.addAttribute("released", releasedService.findAll());
        return "index";
    }

    @RequestMapping(value = "/main", method = RequestMethod.POST)
    public String getSearchResult(@RequestParam String title, @RequestParam String author, @RequestParam String isbn, Model model) {
        List<Book> books = bookService.findAllByTitle(title);
        List<Released> list = new ArrayList<>();
        for (Book book : books) {
            list.addAll(releasedService.findByBookId(book.getId()));
        }
        model.addAttribute("released", list);

        return "index";
    }
}
