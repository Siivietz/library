package com.test.library.repository;

import com.test.library.model.Released;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ReleasedRepo extends JpaRepository<Released, Long> {

     List<Released> findAllById(Long releasedId);

    @Transactional
    void deleteReleasedById(Long id);


    List<Released> findAllByBookId(Long bookId);
}
