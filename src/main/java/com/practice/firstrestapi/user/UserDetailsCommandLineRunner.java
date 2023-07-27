package com.practice.firstrestapi.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class UserDetailsCommandLineRunner implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private UserDetailsRepository repository;

    public UserDetailsCommandLineRunner(UserDetailsRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info(Arrays.toString(args));
        repository.save(new UserDetails("Malisha", "Admin"));
        repository.save(new UserDetails("Ravi", "Admin"));
        repository.save(new UserDetails("John", "User"));

        List<UserDetails> users = repository.findByRole("Admin");
        users.forEach(user -> logger.info(user.toString()));

    }
}
