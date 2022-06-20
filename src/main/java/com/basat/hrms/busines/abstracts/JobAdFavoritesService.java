package com.basat.hrms.busines.abstracts;

import com.basat.hrms.core.utilities.results.DataResult;
import com.basat.hrms.core.utilities.results.Result;
import com.basat.hrms.entities.concretes.JobAdFavorites;

import java.util.List;


public interface JobAdFavoritesService {
    public DataResult<List<JobAdFavorites>> getByCandidateId(int candidateId);
    public Result addFavorite(int candidateId, int jobAdId);
    public Result removeFavorite(int favoriteId);
}
