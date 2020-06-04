package com.tyq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan("com.tyq.aut,mapper")
@SpringBootApplication
public class AutoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoApplication.class, args);
    }

}
