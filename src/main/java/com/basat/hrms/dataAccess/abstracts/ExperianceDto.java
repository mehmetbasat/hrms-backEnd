package com.basat.hrms.dataAccess.abstracts;

import com.basat.hrms.entities.concretes.Experiance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExperianceDto extends JpaRepository<Experiance,Integer> {
    List<Experiance> findByCvId(int id);
}
