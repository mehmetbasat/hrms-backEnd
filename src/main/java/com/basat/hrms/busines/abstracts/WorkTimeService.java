package com.basat.hrms.busines.abstracts;

import com.basat.hrms.core.utilities.results.DataResult;
import com.basat.hrms.entities.concretes.WorkTime;

import java.util.List;

public interface WorkTimeService {
    public DataResult<List<WorkTime>> getAll();
}
