package com.basat.hrms.dataAccess.abstracts;

import com.basat.hrms.entities.concretes.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffDao extends JpaRepository<Staff,Integer> {
}
