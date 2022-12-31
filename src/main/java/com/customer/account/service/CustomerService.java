package com.customer.account.service;

import com.customer.account.dto.CustomerDto;
import com.customer.account.dto.CustomerDtoConverter;
import com.customer.account.exception.CustomerNotFoundException;
import com.customer.account.model.Customer;
import com.customer.account.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerDtoConverter customerDtoConverter;

    public CustomerService(CustomerRepository customerRepository, CustomerDtoConverter customerDtoConverter) {
        this.customerRepository = customerRepository;
        this.customerDtoConverter = customerDtoConverter;
    }

    protected Customer findCustomerById(String id) {
        return customerRepository.findById(id)
                .orElseThrow(
                        () -> new CustomerNotFoundException("Customer could not find by id" + id));
    }

    public CustomerDto getCustomerById(String customerId) {
        return customerDtoConverter.converToCustomerDto(findCustomerById(customerId));
    }
}
