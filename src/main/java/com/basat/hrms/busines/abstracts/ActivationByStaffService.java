package com.basat.hrms.busines.abstracts;

import com.basat.hrms.core.utilities.results.Result;
import com.basat.hrms.entities.concretes.Employer;

public interface ActivationByStaffService {
    void createActivationByStaff(Employer employer);
    Result activateEmployer(int employerId,int staffId);
}
