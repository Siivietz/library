package com.test.library.services;

import com.test.library.model.Book;
import com.test.library.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;

    public List<Book> findAllByBookId(Long bookId) {
        return bookRepo.findAllById(bookId);
    }

    public List<Book> findAll() {
        return bookRepo.findAll();
    }

    public Book save(Book book) {
        return bookRepo.save(book);
    }

    public List<Book> findAllByTitle(String title) {
        return bookRepo.findAllByTitle(title);
    }

    @Transactional
    public void deleteBookById(Long id) {
        bookRepo.deleteById(id);
    }

}
