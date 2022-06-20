package com.basat.hrms.busines.abstracts;

import com.basat.hrms.core.utilities.results.DataResult;
import com.basat.hrms.entities.concretes.WorkPlace;

import java.util.List;

public interface WorkPlaceService {
    public DataResult<List<WorkPlace>> getAll();
}
