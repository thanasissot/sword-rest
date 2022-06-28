package com.sot.thanasis.swordrest.service;

import com.sot.thanasis.swordrest.model.Payment;
import com.sot.thanasis.swordrest.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;

    // CREATE
    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    // READ
    public List<Payment> getPayments() {
        return paymentRepository.findAll();
    }

    // DELETE
    public void deletePayment(Long paymentId) {
        paymentRepository.deleteById(paymentId);
    }
}
