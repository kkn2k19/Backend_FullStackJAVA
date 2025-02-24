package com.karan.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.karan.bean.Customer;
import com.karan.config.SpringConfig;

public class ClientApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
		Customer cst = (Customer) ac.getBean("cs");
		System.out.println(cst);
		ac.close();
	}
}