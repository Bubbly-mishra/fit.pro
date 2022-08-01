package com.stackroute.controller;

import com.stackroute.dto.EnthusiastUpdateRequest;
import com.stackroute.dto.ExpertUpdateRequest;

import com.stackroute.exception.EnthusiastAlreadyExistsException;
import com.stackroute.exception.ExpertAlreadyExistsException;
import com.stackroute.model.Enthusiast;
import com.stackroute.model.Expert;
import com.stackroute.service.EnthusiastService;
import com.stackroute.service.ExpertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")

public class UserController {


    @Autowired
    private EnthusiastService enthusiastService;

    @Autowired
    private ExpertService expertService;

    @PostMapping("/saveEnthusiast")
    public ResponseEntity<String> saveEnthusiast(@RequestBody Enthusiast enthusiast){

        try{
            enthusiastService.saveEnthusiast(enthusiast);
            return new ResponseEntity<>("Enthusiast have Registered Successfully", HttpStatus.OK);
        }catch(EnthusiastAlreadyExistsException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);

        }
    }

    @PatchMapping("/enthusiast/{emailId}")
    public ResponseEntity<?> updateEnthusiast(@PathVariable String emailId, @RequestBody EnthusiastUpdateRequest request){
        enthusiastService.updateEnthusiast(emailId, request);
        return new ResponseEntity<>("Details are Updated", HttpStatus.OK);
    }

    @PostMapping("/saveExpert")
    public ResponseEntity<String> saveExpert(@RequestBody Expert expert) {

        try {
            expertService.saveExpert(expert);
            return new ResponseEntity<>("Expert have Registered Successfully", HttpStatus.OK);
        }catch(ExpertAlreadyExistsException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }

    @PatchMapping("/expert/{emailId}")
    public ResponseEntity<String> updateExpert(@PathVariable String emailId, @RequestBody ExpertUpdateRequest request){
        expertService.updateExpert(emailId, request);
        return new ResponseEntity<String>("Details are Updated", HttpStatus.OK);
    }


}
