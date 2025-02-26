package com.karan.bootjdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class BootjdbcApplication implements CommandLineRunner {
	@Autowired
	private JdbcTemplate template;

	public static void main(String[] args) {
		SpringApplication.run(BootjdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'run'");
		// String insertsql = "insert into account values('100', 'Suman', 15000)";
		// String insertsql = "insert into account values('101', 'Kaushik', 20000)";
		// int n = template.update(insertsql);
		// System.out.println(n + " row inserted");

		String selectsql = "select * from account";
		List aclist = template.queryForList(selectsql);
		aclist.stream().forEach(System.out::println);
	}

}
