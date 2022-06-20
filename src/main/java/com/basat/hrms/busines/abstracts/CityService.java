package com.basat.hrms.busines.abstracts;

import com.basat.hrms.core.utilities.results.DataResult;
import com.basat.hrms.entities.concretes.City;

import java.util.List;

public interface CityService {
    public DataResult<List<City>> getAll();
}
