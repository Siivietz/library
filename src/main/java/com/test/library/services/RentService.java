package com.test.library.services;

import com.test.library.model.Rent;
import com.test.library.repository.RentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentService {
    @Autowired
    private RentRepo rentRepo;
    public void save(Rent rent) {
        rentRepo.save(rent);
    }
}
