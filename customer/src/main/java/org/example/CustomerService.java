package org.example;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    private final WebClient.Builder webClient;

    public CustomerService(CustomerRepository customerRepository, WebClient.Builder webClient) {
        this.customerRepository = customerRepository;
        this.webClient = webClient;
    }

    public void createCustomer(CustomerRegistrationRequest customerRequest) {
        Customer customer = Customer.builder()
                .fname(customerRequest.fname())
                .lname(customerRequest.lname())
                .age(customerRequest.age())
                .build();
        customerRepository.saveAndFlush(customer);
        webClient.build().get()
                .uri("http://KYC/api/v1/froud/" + customer.getId(), uriBuilder -> uriBuilder
                        .build()
                ).retrieve().bodyToMono(FroudResponse.class).block();


    }
}
