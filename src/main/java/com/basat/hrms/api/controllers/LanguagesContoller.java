package com.basat.hrms.api.controllers;

import com.basat.hrms.busines.abstracts.LanguageService;
import com.basat.hrms.core.utilities.results.DataResult;
import com.basat.hrms.core.utilities.results.Result;
import com.basat.hrms.entities.concretes.Language;
import com.basat.hrms.entities.dtos.LanguageForSetDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/language")
@CrossOrigin
public class LanguagesContoller {

    private LanguageService languageService;

    @Autowired
    public LanguagesContoller(LanguageService languageService) {
        this.languageService = languageService;
    }

    @PostMapping("/addLanguage")
    public Result addLanguage(@RequestBody LanguageForSetDto languageForSetDto){
        return this.languageService.addLanguage(languageForSetDto);
    }

    @DeleteMapping("/deleteLanguage")
    public Result deleteLanguage(@RequestParam int languageId){
        return this.languageService.deleteLanguage(languageId);
    }

    @GetMapping("/getByCvId")
    public DataResult<List<Language>> getByCvId(@RequestParam int cvId){
        return this.languageService.getByCvId(cvId);
    }
}
