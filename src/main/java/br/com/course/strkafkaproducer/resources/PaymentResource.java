package br.com.course.strkafkaproducer.resources;

import br.com.course.strkafkaproducer.model.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface PaymentResource {

    @PostMapping
    ResponseEntity<Payment> create(@RequestBody Payment payment);

}
