package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LaptopAdd {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SessionFactory factory=new  Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
         Session session= factory.openSession();
         Transaction tx= session.beginTransaction();
         Laptop laptop=new Laptop();
         laptop.setModelNo("Lenovo MTLP-1878");
         session.save(laptop);
         tx.commit();
         factory.close();
    }
 
}