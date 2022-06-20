package com.basat.hrms.dataAccess.abstracts;

import com.basat.hrms.entities.concretes.WorkPlace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkPlaceDao extends JpaRepository<WorkPlace,Integer> {
}
