package com.karan.bootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.karan.bean.Customer;

@SpringBootApplication
@ComponentScan(basePackages = "com.karan")
public class BootdemoApplication implements CommandLineRunner {
	@Autowired
	private Customer cs;

	public static void main(String[] args) {
		SpringApplication.run(BootdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'run'");
		System.out.println(cs);
	}

}
