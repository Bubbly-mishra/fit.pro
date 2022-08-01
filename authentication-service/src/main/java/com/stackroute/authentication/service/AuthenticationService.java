package com.stackroute.authentication.service;

import com.stackroute.authentication.model.Authentication;

public interface AuthenticationService {
    Authentication createUser(Authentication authentication);
    void updateUser(Authentication authentication);

    String authenticateUser(Authentication authentication);
}
