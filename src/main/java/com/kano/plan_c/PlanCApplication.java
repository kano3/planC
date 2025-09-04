package com.kano.plan_c;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kano.plan_c.server.mapper")
public class PlanCApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlanCApplication.class, args);
    }

}
