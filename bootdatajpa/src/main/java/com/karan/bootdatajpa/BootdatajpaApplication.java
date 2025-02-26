package com.karan.bootdatajpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.karan.model.Job;
import com.karan.service.JobService;

@SpringBootApplication
@EntityScan(basePackages = "com.karan.model")
@EnableJpaRepositories(basePackages = "com.karan.repository")
@ComponentScan(basePackages = "com.karan")
public class BootdatajpaApplication implements CommandLineRunner {
	@Autowired
	private JobService jservice;

	public static void main(String[] args) {
		SpringApplication.run(BootdatajpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'run'");

		// ADD METHOD CALLING THROUGH OBJECT OF SERVICE CLASS
		// Job j = new Job("J2", "DOTNET", "TCS");
		// jservice.addData(j);
		// for first time table creation and data insertion make
		// "hibernate.ddl-auto=create" but for just update or add use
		// "hibernate.ddl-auto=update"

		// Fetch/get all data
		List<Job> jlist = jservice.getData();
		jlist.stream().forEach(System.out::println);

		// Fetch Data by Id
		// Job j = jservice.getDataById("J1");
		// System.out.println(j);

		// // DELETE DATA BY ID
		// jservice.deleteData("J1");

		// UPDATE DATA BY ID
		Job j = jservice.updateData("J2");
		System.out.println(j);
	}
}
