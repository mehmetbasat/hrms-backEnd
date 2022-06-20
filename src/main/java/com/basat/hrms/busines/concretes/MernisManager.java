package com.basat.hrms.busines.concretes;

import com.basat.hrms.busines.abstracts.NationalValidationService;
import com.basat.hrms.entities.concretes.Candidate;
import org.springframework.stereotype.Service;

@Service
public class MernisManager implements NationalValidationService {


    @Override
    public boolean validate(Candidate candidate) {
        if(candidate.getNationalNumber().length()!=11){
            return false;
        }
        return true;
    }
}
