package com.basat.hrms.dataAccess.abstracts;

import com.basat.hrms.entities.concretes.EmployerUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerUpdateDao extends JpaRepository<EmployerUpdate, Integer> {
}
