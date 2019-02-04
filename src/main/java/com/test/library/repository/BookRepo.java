package com.test.library.repository;

import com.test.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {

    List<Book> findAllByTitle(String title);

    @Transactional
    void deleteBookById(Long id);


}
