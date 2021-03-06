package com.basat.hrms.dataAccess.abstracts;

import com.basat.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer,Integer> {
    Employer findByEmail(String email);
}
