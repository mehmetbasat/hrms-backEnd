package com.basat.hrms.dataAccess.abstracts;

import com.basat.hrms.entities.concretes.WorkTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkTimeDao extends JpaRepository<WorkTime,Integer> {
}
