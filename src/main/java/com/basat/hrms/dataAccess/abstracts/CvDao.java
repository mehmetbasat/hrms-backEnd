package com.basat.hrms.dataAccess.abstracts;

import com.basat.hrms.entities.concretes.Cv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvDao extends JpaRepository<Cv,Integer> {
    Cv findByCandidateId(int id);
}
