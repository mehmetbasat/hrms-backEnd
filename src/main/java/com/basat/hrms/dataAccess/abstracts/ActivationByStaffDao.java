package com.basat.hrms.dataAccess.abstracts;

import com.basat.hrms.entities.concretes.ActivationByStaff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivationByStaffDao extends JpaRepository<ActivationByStaff,Integer> {
    ActivationByStaff findByEmployeId(int id);

}
