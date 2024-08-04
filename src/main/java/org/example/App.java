package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
       Student st=context.getBean("stu",Student.class);
        System.out.println(st.getName());
        System.out.println(st.getAddress().getCity());
        System.out.println(st);
    }
}
