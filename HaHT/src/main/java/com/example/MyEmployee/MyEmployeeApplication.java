package com.example.MyEmployee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class MyEmployeeApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyEmployeeApplication.class, args);
    }
}
