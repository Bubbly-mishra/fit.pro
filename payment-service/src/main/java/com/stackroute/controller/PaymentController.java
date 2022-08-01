package com.stackroute.controller;

import com.stackroute.model.PaymentRequest;
import com.stackroute.service.PaymentService;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping("/payment")
    public ResponseEntity<String> completePayment(@RequestBody PaymentRequest request) throws StripeException {

        String chargeId= service.charge(request);
        if (chargeId!=null){
            return new ResponseEntity<String>(chargeId, HttpStatus.OK);
        }else{
            return new ResponseEntity<String>("Please check the credit card details entered",HttpStatus.BAD_REQUEST);
        }
    }

    @ExceptionHandler
    public String handleError(StripeException ex) {
        return ex.getMessage();
    }
}
