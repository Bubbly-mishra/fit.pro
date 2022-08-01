package com.stackroute.service;

import com.stackroute.dto.EnthusiastUpdateRequest;
import com.stackroute.exception.EnthusiastAlreadyExistsException;
import com.stackroute.exception.EnthusiastNotFoundException;
import com.stackroute.model.Enthusiast;

import java.util.Optional;

public interface EnthusiastService {

    public Enthusiast saveEnthusiast(Enthusiast enthusiast) throws EnthusiastAlreadyExistsException;

    public Enthusiast updateEnthusiast(String emailId, EnthusiastUpdateRequest request);

    Optional<Enthusiast> getEnthusiastByUsername(String username) throws EnthusiastNotFoundException;
}
