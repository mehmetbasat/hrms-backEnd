package com.basat.hrms.busines.abstracts;

import com.basat.hrms.entities.concretes.Candidate;

public interface NationalValidationService {
    boolean validate(Candidate candidate);
}
