package com.crts.app.sme.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class LoanDisbursmentPaymentLedgerCreationApplication {

	public static void main(String[] args)
	{
		System.out.println("Start");
		SpringApplication.run(LoanDisbursmentPaymentLedgerCreationApplication.class, args);
		System.out.println("End");
	}

}
