package nju.software.web.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import nju.software.data.dataobject.Auction;

public class Test {
    private static Configuration configuration = new Configuration().configure();
    private static SessionFactory factory = configuration.buildSessionFactory();
    private static Session session = null;
    private static Transaction transaction = null;
    /*public Test() {
        configuration = new Configuration().configure();
        factory = configuration.buildSessionFactory();
    }*/
    private static void init() {
        session = factory.openSession();
        session.beginTransaction();
    }

    private static void destroy() {
        session.getTransaction().commit();
        session.close();
        factory.close();
    }
    
    public static void insert(Auction auction) {
        init();
        session.save(auction);
        destroy();
    }
    
    /*public static void main(String[] args) {
        Auction auction =new Auction(null, "11", "11", "11", "11", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        insert(auction);
        
    }*/
    /*public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        Auction auction =new Auction(null, "11", "11", "11", "11", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        System.out.println(auction);
        session.save(auction);
        session.getTransaction().commit();
        session.close();
    }*/

}
