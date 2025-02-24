package com.karan.client;

import java.awt.print.Book;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.karan.bean.Candidate;
import com.karan.bean.Category;
import com.karan.bean.Client;
import com.karan.bean.Customer;
import com.karan.bean.Employee;
import com.karan.bean.RetailShop;
import com.karan.bean.Test;
import com.karan.config.SpringConfig;

public class ClientApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        // Customer cst = (Customer) ac.getBean("cs");
        // System.out.println(cst);

        Employee em = (Employee) ac.getBean("emp");
        System.out.println(em);

        Client cmp = (Client) ac.getBean("cl");
        System.out.println(cmp);

        RetailShop r = (RetailShop) ac.getBean("rs");
        System.out.println(r);

        Category c1 = (Category) ac.getBean("cg");
        System.out.println(c1);

        Candidate c2 = (Candidate) ac.getBean("cd");
        System.out.println(c2);

        Test t1 = (Test) ac.getBean("tst");
        Test t2 = (Test) ac.getBean("tst");

        t1.setTestid("T1");
        t1.setTestnm("Core Java Testing");
        t1.setTestduration(15);
        t1.setTsoftware("JUNIT");

        t2.setTestid("T2");
        t2.setTestnm("Integration Testing");
        t2.setTestduration(25);
        t2.setTsoftware("SELENIUM");

        System.out.println(t1);
        System.out.println(t2);

        ac.close();
    }

}
