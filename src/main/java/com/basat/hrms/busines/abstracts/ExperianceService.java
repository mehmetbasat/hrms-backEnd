package com.basat.hrms.busines.abstracts;


import com.basat.hrms.core.utilities.results.DataResult;
import com.basat.hrms.core.utilities.results.Result;
import com.basat.hrms.entities.concretes.Experiance;
import com.basat.hrms.entities.dtos.ExperianceForSetDto;

import java.util.List;

public interface ExperianceService{
    Result add(ExperianceForSetDto experianceForSetDto);
    Result delete(int experianceId);
    DataResult<List<Experiance>> getByCvId(int id);
}
