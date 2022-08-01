package com.stackroute.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;


import com.stackroute.model.PaymentRequest;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.stripe.Stripe;

import com.stripe.model.Charge;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Value("${STRIPE_SECRET_KEY}")
    private String secretKey;
    @PostConstruct
    public void init() {
        Stripe.apiKey = secretKey;
    }
    @Override
    public String charge(PaymentRequest chargeRequest) throws StripeException {
        Map<String, Object> chargeParams = new HashMap<>();
        chargeParams.put("amount", chargeRequest.getAmount());
        chargeParams.put("currency", PaymentRequest.Currency.INR);
        chargeParams.put("source", chargeRequest.getToken().getId());

        Charge charge = Charge.create(chargeParams);
        return charge.getId();
    }

}
