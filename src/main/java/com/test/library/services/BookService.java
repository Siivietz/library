package com.test.library.services;

import com.test.library.model.Book;
import com.test.library.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class BookService {
    @Autowired
    BookRepo bookRepo;
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }
}
