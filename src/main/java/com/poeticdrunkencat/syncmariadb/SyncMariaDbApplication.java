package com.poeticdrunkencat.syncmariadb;

import com.poeticdrunkencat.syncmariadb.entitys.transaction_state;
import com.poeticdrunkencat.syncmariadb.repositorys.tech.techRepossitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
public class SyncMariaDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SyncMariaDbApplication.class, args);
    }

    @Autowired
    @Bean
    CommandLineRunner runner(techRepossitory repository) {
        return args -> {
            transaction_state ts = new transaction_state("insert", "test", "test");

            repository.save(ts);
            System.out.println(ts.getTransaction_name() + " " + ts.getTransaction_user());
        };

    }


}
