package com.niit.collaborationbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.configuration.ApplicationConfiguration;

import com.niit.dao.UsersDao;

import com.niit.model.Users;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
   //annotationConfigApplicationContext.refresh();
        UsersDao userDao=(UsersDao)annotationConfigApplicationContext.getBean("UserDaoImpl");
        Users user=new Users();
        System.out.println("starting");
       user.setUsername("kavi");
        user.setPassword("bujji");
        userDao.registerUser(user);
        System.out.println("kavitha");
       
       
         
        
    }
}
