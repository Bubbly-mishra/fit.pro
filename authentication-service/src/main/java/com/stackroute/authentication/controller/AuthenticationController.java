package com.stackroute.authentication.controller;

import com.stackroute.authentication.model.Authentication;
import com.stackroute.authentication.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = {"/api/v1"})
public class AuthenticationController {

    private final AuthenticationService authenticationService;
    @Autowired
    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/createUser")
    public ResponseEntity<?> authentication(@RequestBody Authentication authentication) {
        try {
            authenticationService.createUser(authentication);
            return new ResponseEntity<>("User created Successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("User creation failed", HttpStatus.CONFLICT);
        }
    }


    @PutMapping("/updateUser")
    public ResponseEntity<?> updateAuthentication( @RequestBody Authentication authentication) {
        try {
            authenticationService.updateUser(authentication);
            return new ResponseEntity<>("User updated Successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("User update failed", HttpStatus.CONFLICT);
        }
    }

    @PostMapping("/authenticateUser")
    public ResponseEntity<?> authenticateUser(@RequestBody Authentication authentication){
        try {
              String jwtToken= authenticationService.authenticateUser(authentication);
              if (jwtToken!=null)
               return new ResponseEntity<>("User authenticated successfully",HttpStatus.FOUND);
              else
                  throw new Exception("User authentication failed");
        }catch (Exception e){
            return new ResponseEntity<>("User authentication failed",HttpStatus.NOT_FOUND);
        }
    }

}
