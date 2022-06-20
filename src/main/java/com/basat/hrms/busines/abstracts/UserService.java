package com.basat.hrms.busines.abstracts;

import com.basat.hrms.core.utilities.results.DataResult;
import com.basat.hrms.entities.concretes.User;
import com.basat.hrms.entities.dtos.UserLoginDto;
import com.basat.hrms.entities.dtos.UserLoginReturnDto;

import java.util.List;

public interface UserService {
    DataResult<List<User>> getAll();
    DataResult<User> getByEmail(String email);
    DataResult<UserLoginReturnDto> login(UserLoginDto userLoginDto);
    DataResult<List<User>> getVerifyedUsers();
}
