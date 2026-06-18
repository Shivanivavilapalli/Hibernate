package com.HibernateApps;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        SessionFactory fsc = conf.buildSessionFactory();
        Session sess = fsc.openSession();
        Transaction tx = sess.beginTransaction();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.insert");
        System.out.println("2.getbyid");
        System.out.println("3.getallData");
        System.out.println("4.update");
        System.out.println("5.delete");
        int choice = sc.nextInt();
        if(choice==1) {
        	product p = new product();
        	System.out.println("enter name to insert");
          p.setPname(sc.next());
          System.out.println("enter price to insert");
          p.setPrice(sc.nextDouble());
          sess.save(p);
          tx.commit();
          System.out.println("Table created");
          System.out.println("Row Creadted");
        }
        else if(choice==2) {
        	  System.out.println("enter id to get data");
            int id = sc.nextInt();
            product p = sess.get(product.class,id);
            if(p!=null) {
            	System.out.println(p.getPid());
            	System.out.println(p.getPname());
            	System.out.println(p.getPrice());
            }
            else {
            	System.out.println("id is not there in database");
            }
        }
        else if(choice==3) {

          List<product> al = sess.createQuery("from product", product.class).list();
          for(product x:al) {
          	System.out.println(x.getPid()+" "+x.getPname()+" "+x.getPrice());
          }
        }
        else if(choice==4) {
        	  
         
          System.out.println("enter id to update");
        int id = sc.nextInt();
        product p = sess.get(product.class,id);
        if(p!=null) {
      	  System.out.println("enter name to update");
      	  p.setPname(sc.next());
      	  System.out.println("enter new price");
      	  p.setPrice(sc.nextDouble());
      	  tx.commit();
      	  System.out.println("record update sucessfully");
        }
        else {
      	  System.out.println("wrong id enter");
        }
        }
        else if(choice==5) {
        	 
            System.out.println("enter id to delete");
            int id = sc.nextInt();
            product p = sess.get(product.class, id);
            if(p!=null) {
            	sess.delete(p);
            	tx.commit();
            	System.out.println("data is deleted");
            }
            else {
            	System.out.println("invalid id");
            }
        }
        else {
        	System.out.println("invalid input");
        }
      
        
    }
}
