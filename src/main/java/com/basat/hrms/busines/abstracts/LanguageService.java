package com.basat.hrms.busines.abstracts;

import com.basat.hrms.core.utilities.results.DataResult;
import com.basat.hrms.core.utilities.results.Result;
import com.basat.hrms.entities.concretes.Language;
import com.basat.hrms.entities.dtos.LanguageForSetDto;

import java.util.List;

public interface LanguageService {
    public Result addLanguage(LanguageForSetDto languageForSetDto);
    public Result deleteLanguage(int languageId);
    public DataResult<List<Language>> getByCvId(int cvId);
}
