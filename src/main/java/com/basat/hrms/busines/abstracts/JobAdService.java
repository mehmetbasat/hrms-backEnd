package com.basat.hrms.busines.abstracts;

import com.basat.hrms.core.utilities.results.DataResult;
import com.basat.hrms.core.utilities.results.Result;
import com.basat.hrms.entities.concretes.JobAd;
import com.basat.hrms.entities.dtos.JobAdDto;
import com.basat.hrms.entities.dtos.JobAdFilter;

import java.util.List;

public interface JobAdService {
    Result create(JobAdDto jobAdDto);
    Result setPasssive(int jobAdId);
    Result setActiveAndConfirm(int jobAdId,int staffId);
    DataResult<List<JobAd>> getAll();
    DataResult<JobAd> getByJobAdId(int id);
    DataResult<List<JobAd>> getActiveAds();
    DataResult<List<JobAd>> getActiveAndOrderLastDate();
    DataResult<List<JobAd>> getActiveAndCompanyId(int id);
    DataResult<List<JobAd>> getByIsActiveAndPageNumberAndFilter(int pageNo, int pageSize, JobAdFilter jobAdFilter);
}
