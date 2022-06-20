package com.basat.hrms.busines.abstracts;

import com.basat.hrms.core.utilities.results.Result;
import com.basat.hrms.entities.concretes.ActivationCode;
import com.basat.hrms.entities.concretes.User;

public interface ActivationCodeService {
    ActivationCode getByCode(String code);
    String createActivationCode(User user);
    Result activateUser(String code);
}
