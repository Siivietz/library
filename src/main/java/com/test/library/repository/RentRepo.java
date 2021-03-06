package com.test.library.repository;

import com.test.library.model.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RentRepo extends JpaRepository<Rent, Long> {
}
