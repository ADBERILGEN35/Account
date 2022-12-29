package com.customer.account;

import com.customer.account.model.Account;
import kotlin.collections.SetsKt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@SpringBootApplication
public class AccountApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Account account1 = new Account("a", BigDecimal.ONE, LocalDateTime.now(), null, SetsKt.emptySet());
        Account account2 = new Account("a", BigDecimal.ONE, LocalDateTime.now(), null, SetsKt.emptySet());

        Set<Account> aa = Set.of(account1, account2);
    }
}
