package com.taby.java_test.payments;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest request);
}
