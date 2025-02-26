package com.karan.bootsetterinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.karan.bean.Employee;

@SpringBootApplication
@ComponentScan(basePackages = "com.karan")
public class BootsetterinjectionApplication implements CommandLineRunner {
	@Autowired
	private Employee emp;

	public static void main(String[] args) {
		SpringApplication.run(BootsetterinjectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'run'");
		System.out.println(emp);
	}

}
