package com.karan.readingyml_vsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.karan.bean.DbConn;

@SpringBootApplication
@ComponentScan(basePackages = "com.karan")
public class ReadingymlVsdemoApplication implements CommandLineRunner {
	@Autowired
	private DbConn db;

	public static void main(String[] args) {
		SpringApplication.run(ReadingymlVsdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'run'");
		System.out.println(db);
	}

}
