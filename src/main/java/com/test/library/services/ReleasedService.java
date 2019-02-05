package com.test.library.services;

import com.test.library.model.Released;
import com.test.library.repository.ReleasedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ReleasedService {

    @Autowired
    private ReleasedRepo releasedRepo;

    public List<Released> findAllByReleasedId(Long releasedId) {
        return releasedRepo.findAllById(releasedId);
    }

    public List<Released> findAll() {
        return releasedRepo.findAll();
    }

    public Released save(Released released) {
        return releasedRepo.save(released);
    }
@Transactional
    public void deleteReleasedById(Long id) {
        releasedRepo.deleteReleasedById(id);
    }


}
