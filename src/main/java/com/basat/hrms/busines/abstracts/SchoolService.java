package com.basat.hrms.busines.abstracts;

import com.basat.hrms.core.utilities.results.DataResult;
import com.basat.hrms.core.utilities.results.Result;
import com.basat.hrms.entities.concretes.School;
import com.basat.hrms.entities.dtos.SchoolForSerDto;

import java.util.List;

public interface SchoolService {
    public Result addSchool(SchoolForSerDto schoolForSerDto);
    public Result deleteSchool(int schoolId);
    public DataResult<List<School>> getByCvId(int cvId);
}
