package com.basat.hrms.busines.concretes;

import com.basat.hrms.busines.abstracts.WorkTimeService;
import com.basat.hrms.core.utilities.results.DataResult;
import com.basat.hrms.core.utilities.results.SuccessDataResult;
import com.basat.hrms.dataAccess.abstracts.WorkTimeDao;
import com.basat.hrms.entities.concretes.WorkTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkTimeManager implements WorkTimeService {

    private WorkTimeDao workTimeDao;

    @Autowired
    public WorkTimeManager(WorkTimeDao workTimeDao) {
        this.workTimeDao = workTimeDao;
    }

    @Override
    public DataResult<List<WorkTime>> getAll() {
        return new SuccessDataResult<List<WorkTime>>(this.workTimeDao.findAll(),"Data listelendi");
    }
}
