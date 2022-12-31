package com.customer.account;

import com.customer.account.model.Account;
import com.customer.account.model.Customer;
import com.customer.account.repository.CustomerRepository;
import kotlin.collections.SetsKt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class AccountApplication implements CommandLineRunner {

    public AccountApplication(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }

    private final CustomerRepository customerRepository;


    @Override
    public void run(String... args) throws Exception {
        Customer customer = customerRepository.save(new Customer("", "Oğuzhan", "Taşyaran", new HashSet<>()));
        System.out.println(customer);
    }
}
