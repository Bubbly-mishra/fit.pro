package com.stackroute.service;

import com.stackroute.dto.ExpertUpdateRequest;
import com.stackroute.exception.ExpertAlreadyExistsException;
import com.stackroute.exception.ExpertNotFoundException;
import com.stackroute.model.Expert;

import java.util.Optional;

public interface ExpertService {

    public Expert saveExpert(Expert expert) throws ExpertAlreadyExistsException;

    public Expert updateExpert(String emailId, ExpertUpdateRequest request);

    Optional<Expert> getExpertByUsername(String username) throws ExpertNotFoundException;
}
