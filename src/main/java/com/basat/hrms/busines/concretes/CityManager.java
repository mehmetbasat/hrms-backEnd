package com.basat.hrms.busines.concretes;

import com.basat.hrms.busines.abstracts.CityService;
import com.basat.hrms.core.utilities.results.DataResult;
import com.basat.hrms.core.utilities.results.SuccessDataResult;
import com.basat.hrms.dataAccess.abstracts.CityDao;
import com.basat.hrms.entities.concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityManager implements CityService {

    private CityDao cityDao;

    @Autowired
    public CityManager(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Override
    public DataResult<List<City>> getAll() {
        return new SuccessDataResult<List<City>>(this.cityDao.findAll(),"Data listelendi");
    }
}
