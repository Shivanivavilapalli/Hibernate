package com.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


//hibernate a tool that helps java application interact with database,it simply storing and retrieving data,reduce the amount code needed

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
////    	it gives db connectivity
//       Configuration conn = new Configuration().configure("hibernate.cfg.xml");
////       building database
//       SessionFactory sf = conn.buildSessionFactory();
////       started creating database
//       Session s = sf.openSession();
////       ready to insert
//       s.beginTransaction();
////       ready to save
//       s.save(s);
////       output
//       s.getTransaction().commit();
// 
    	
//    Configuration conn = new Configuration().configure("hibernate.cfg.xml");
//    
    	
    	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    	
    	Metadata mt = new MetadataSources(ssr).getMetadataBuilder().build();
    	
      SessionFactory sf = mt.buildSessionFactory();
      
      Session s = sf.openSession();
      
      Transaction t = s.beginTransaction();
      
      hibernate h = new hibernate();
      
      h.setName("shivani");
      
      h.setEmail("shivani@gmail.com");
      
      h.setPassword("rty5ui78");
      
      h.setPhoneno(999999);
      
      
      s.save(h);
      
      t.commit();
      
      System.out.println("successfully inserted");
      
      sf.close();
      
      s.close();
      
      
       
    }
}
