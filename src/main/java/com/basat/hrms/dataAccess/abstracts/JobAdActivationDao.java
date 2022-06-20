package com.basat.hrms.dataAccess.abstracts;

import com.basat.hrms.entities.concretes.JobAdActivation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobAdActivationDao extends JpaRepository<JobAdActivation,Integer> {
}
