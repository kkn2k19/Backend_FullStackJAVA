package com.karan.bootregister;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.karan.model.Register;
import com.karan.service.RegisterService;

@SpringBootApplication
@ComponentScan(basePackages = "com.karan")
@EntityScan(basePackages = "com.karan.model")
@EnableJpaRepositories(basePackages = "com.karan.repository")
public class BootregisterApplication implements CommandLineRunner {
	@Autowired
	private RegisterService rservice;

	public static void main(String[] args) {
		SpringApplication.run(BootregisterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'run'");

		// Register r = new Register("root", "1448", "Karan", "93043",
		// "kkn2k19@gmail.com");
		// Register r = new Register("root1", "14", "KKN", "5656", "kkn@gmail.com");
		// rservice.addData(r);

		// List<Register> rlist = rservice.getData();
		// rlist.stream().forEach(System.out::println);

		// Register r = rservice.getDataById("root");
		// System.out.println(r);

		// rservice.deleteData("root1");

		Register r = rservice.updateData("root");
		System.out.println(r);
	}

}
