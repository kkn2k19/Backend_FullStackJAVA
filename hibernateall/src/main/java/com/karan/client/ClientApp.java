package com.karan.client;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.karan.entity.Adhar;
import com.karan.entity.Customer;
import com.karan.entity.Employee;
import com.karan.entity.Project;
import com.karan.entity.Student;

public class ClientApp {

    public static void main(String[] args) {
        EntityTransaction tx = null;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AppDB"); // Reading JDBC
        EntityManager em = emf.createEntityManager(); // adding updating delete create table
        tx = em.getTransaction(); // Transaction Created
        tx.begin(); // begin the transaction
        // Student sd1 = new Student("101", "Karan", "IT");
        // em.persist(sd1); // table created data inserted

        // Employee emp1 = new Employee();
        // Employee emp2 = new Employee();
        //
        // emp1.setEname("Karan");
        // emp1.setEdesig("Manager");
        // emp1.setSal(65000.00);
        // emp1.setHiredt(new Date());
        // emp1.setWorkhr(new Date());
        //
        // emp2.setEname("Chandan");
        // emp2.setEdesig("Analyst");
        // emp2.setSal(55000.00);
        // emp2.setHiredt(new Date());
        // emp2.setWorkhr(new Date());
        //
        // em.persist(emp1);
        // em.persist(emp2);

        // Customer c1 = new Customer();
        // c1.setCid("C1");
        // c1.setCname("Annanya");
        //
        // Customer c2 = new Customer();
        // c2.setCid("C2");
        // c2.setCname("Ajoy");
        //
        // Adhar a1 = new Adhar();
        // a1.setAdharno("ADRWR123");
        // a1.setCity("KOLKATA");
        //
        // Adhar a2 = new Adhar();
        // a2.setAdharno("HDDFDDF23");
        // a2.setCity("CHENNAI");

        // Adhar a1 = new Adhar("ADRWR123", "Kolkata");
        // Adhar a2 = new Adhar("HDDFDDF23", "Chennai");
        //
        // Customer c1 = new Customer("C1", "Annanya", a1);
        // Customer c2 = new Customer("C2", "Ajoy", a2);
        //
        // em.persist(a1);
        // em.persist(a2);
        //
        // em.persist(c1);
        // em.persist(c2);

        System.out.println("CRUD OPERATION");
        System.out.println("INSERT DATA ----");
        Project p1 = new Project("P1", "Full Stack", "Spring Boot", 180);
        Project p2 = new Project("P2", "Web Technology", "ReactJS", 120);
        // em.persist(p1);
        // em.persist(p2);

        // System.out.println("DELETE DATA ----");
        // Project ps = em.find(Project.class, "P1"); // select * from project where
        // projid = "P1"
        // if (ps != null) {
        // em.remove(ps);
        // }

        System.out.println("UPDATE DATA ----");
        Project ps = em.find(Project.class, "P2");
        if (ps != null) {
            ps.setProjnm("Mobile App");
            ps.setTech("React Native");
            ps.setDuration(150);
            em.merge(ps);
        }

        System.out.println("DISPLAY DATA ----");
        String jpql = "select p from Project as p";
        // Query query = em.createQuery(jpql);
        // List<Project> plist = query.getResultList();
        // plist.stream().forEach(System.out::println);

        String hql = "from Project";
        Query query = em.createQuery(hql);
        List<Project> plist = query.getResultList();
        plist.stream().forEach(System.out::println);

        tx.commit();
        emf.close();
    }
}