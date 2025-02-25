package com.karan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.karan.bean.DbConn;

@SpringBootApplication
public class ReadingProperties implements CommandLineRunner {
    @Autowired
    private DbConn db;

    public static void main(String[] args) {
        SpringApplication.run(ReadingProperties.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'run'");
        System.out.println(db);
    }

}
