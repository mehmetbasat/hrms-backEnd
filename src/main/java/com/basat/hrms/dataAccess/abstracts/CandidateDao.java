package com.basat.hrms.dataAccess.abstracts;

import com.basat.hrms.entities.concretes.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateDao extends JpaRepository<Candidate,Integer> {
    Candidate findByNationalNumber(String nationalNumber);
    Candidate findByEmail(String email);
    List<Candidate> findByMailVerifyTrue();
}
