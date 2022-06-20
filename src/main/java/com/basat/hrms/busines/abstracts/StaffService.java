package com.basat.hrms.busines.abstracts;

import com.basat.hrms.core.utilities.results.DataResult;
import com.basat.hrms.core.utilities.results.Result;
import com.basat.hrms.entities.concretes.Staff;
import com.basat.hrms.entities.dtos.StaffUpdateDto;

import java.util.List;

public interface StaffService {
    public Result create(Staff staff);
    public DataResult<List<Staff>> getAll();
    public Result update(StaffUpdateDto staffUpdateDto);
}
