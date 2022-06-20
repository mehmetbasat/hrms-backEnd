package com.basat.hrms.busines.abstracts;

import com.basat.hrms.entities.concretes.User;

public interface EmailService {
    void sendVerifyEmail(User user,String code);
}
