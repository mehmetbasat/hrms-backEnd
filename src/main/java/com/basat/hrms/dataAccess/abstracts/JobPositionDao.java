package com.basat.hrms.dataAccess.abstracts;

import com.basat.hrms.entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {
    JobPosition findByName(String name);
}
