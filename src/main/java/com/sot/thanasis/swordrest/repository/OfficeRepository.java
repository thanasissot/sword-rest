package com.sot.thanasis.swordrest.repository;

import com.sot.thanasis.swordrest.model.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepository extends JpaRepository<Office, Long> {
}
