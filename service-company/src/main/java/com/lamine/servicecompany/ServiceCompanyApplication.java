package com.lamine.servicecompany;

import com.lamine.servicecompany.Dao.CompanyRepoository;
import com.lamine.servicecompany.Entity.Company;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class ServiceCompanyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCompanyApplication.class, args);
    }


    @Bean
    CommandLineRunner start(CompanyRepoository companyRepoository ){

        return args->{
            Stream.of("A","B","C").forEach(cn->{
                companyRepoository.save(new Company(null,cn,100+Math.random()*900));
            });
            companyRepoository.findAll().forEach(System.out::println);
        };
    }

}
