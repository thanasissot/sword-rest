package com.sot.thanasis.swordrest;

import com.sot.thanasis.swordrest.controller.CustomerController;
import com.sot.thanasis.swordrest.model.Customer;
import com.sot.thanasis.swordrest.service.CustomerService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@Log4j2
@SpringBootApplication
public class SwordRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwordRestApplication.class, args);
    }

}
