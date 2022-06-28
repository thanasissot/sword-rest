package com.sot.thanasis.swordrest.service;

import com.sot.thanasis.swordrest.model.Office;
import com.sot.thanasis.swordrest.repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficeService {
    @Autowired
    OfficeRepository officeRepository;

    // CREATE
    public Office createOffice(Office office) {
        return officeRepository.save(office);
    }

    // READ
    public List<Office> getOffices() {
        return officeRepository.findAll();
    }

    // DELETE
    public void deleteOffice(Long officeId) {
        officeRepository.deleteById(officeId);
    }
}
