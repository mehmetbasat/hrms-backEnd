package com.basat.hrms.dataAccess.abstracts;

import com.basat.hrms.entities.concretes.ActivationCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivationCodeDao extends JpaRepository<ActivationCode,Integer> {
    ActivationCode findByCode(String code);
}
