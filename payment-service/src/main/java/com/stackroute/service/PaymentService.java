package com.stackroute.service;

import com.stackroute.model.PaymentRequest;
import com.stripe.exception.StripeException;

public interface PaymentService {

    public String charge(PaymentRequest chargeRequest) throws StripeException;
}
