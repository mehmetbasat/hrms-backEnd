package com.basat.hrms.busines.abstracts;

import com.basat.hrms.core.utilities.results.DataResult;
import com.basat.hrms.core.utilities.results.Result;
import com.basat.hrms.entities.concretes.Technology;
import com.basat.hrms.entities.dtos.TechnologyForSerDto;

import java.util.List;

public interface TechnologyService {
    public Result addTechnology(TechnologyForSerDto technologyForSerDto);
    public Result deleteTechnology(int technologyId);
    public DataResult<List<Technology>> getByCvId(int cvId);
}
