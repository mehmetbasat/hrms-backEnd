package com.basat.hrms.busines.concretes;

import com.basat.hrms.busines.abstracts.WorkPlaceService;
import com.basat.hrms.core.utilities.results.DataResult;
import com.basat.hrms.core.utilities.results.SuccessDataResult;
import com.basat.hrms.dataAccess.abstracts.WorkPlaceDao;
import com.basat.hrms.entities.concretes.WorkPlace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkPlaceManager implements WorkPlaceService {

    private WorkPlaceDao workPlaceDao;

    @Autowired
    public WorkPlaceManager(WorkPlaceDao workPlaceDao) {
        this.workPlaceDao = workPlaceDao;
    }

    @Override
    public DataResult<List<WorkPlace>> getAll() {
        return new SuccessDataResult<List<WorkPlace>>(this.workPlaceDao.findAll(),"Data listelendi");
    }
}
