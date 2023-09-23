package br.com.course.strkafkaproducer.service;

import br.com.course.strkafkaproducer.model.Payment;

public interface PaymentService {
    void createPayment(Payment payment);
}
