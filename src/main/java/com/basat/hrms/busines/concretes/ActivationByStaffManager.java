package com.basat.hrms.busines.concretes;

import com.basat.hrms.busines.abstracts.ActivationByStaffService;
import com.basat.hrms.core.utilities.results.ErrorResult;
import com.basat.hrms.core.utilities.results.Result;
import com.basat.hrms.core.utilities.results.SuccessResult;
import com.basat.hrms.dataAccess.abstracts.ActivationByStaffDao;
import com.basat.hrms.dataAccess.abstracts.EmployerDao;
import com.basat.hrms.entities.concretes.ActivationByStaff;
import com.basat.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDate;

@Service
public class ActivationByStaffManager implements ActivationByStaffService {

    private ActivationByStaffDao activationByStaffDao;
    private EmployerDao employerDao;

    @Autowired
    public ActivationByStaffManager(ActivationByStaffDao activationByStaffDao,EmployerDao employerDao) {
        this.activationByStaffDao = activationByStaffDao;
        this.employerDao=employerDao;
    }

    @Override
    public void createActivationByStaff(Employer employer) {
        ActivationByStaff activationByStaff=new ActivationByStaff();
        activationByStaff.setEmployeId(employer.getId());
        activationByStaff.setVerifyed(false);
        activationByStaff.setStaffId(null);
        activationByStaffDao.save(activationByStaff);
    }

    @Override
    public Result activateEmployer(int employerId,int staffId) {

        try {
            Employer employer = employerDao.getById(employerId);
            ActivationByStaff activationByStaff = activationByStaffDao.findByEmployeId(employerId);

            employer.setActive(true);
            employerDao.save(employer);

            activationByStaff.setVerifyed(true);
            activationByStaff.setVerifyDate(LocalDate.now());
            activationByStaff.setStaffId(staffId);
            activationByStaffDao.save(activationByStaff);

        }catch (EntityNotFoundException exception){
            return new ErrorResult("Hatalı id");
        }
        return new SuccessResult("Kullanıcı aktif edildi");
    }
}
