package com.faheemali.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  //Method 1:  Eagerly Loading / Eager
		
	      ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml"); 
	      Movies obj = (Movies) context.getBean("movie1");  
	      System.out.println(obj.hashCode()); // Since Spring Bean is Singleton the hashcode for both the objects is same that is both of them have same reference.

	      //Movies obj1 = (Movies) context.getBean("movie1");   
	      //System.out.println(obj1.hashCode());

          //Movies obj = context.getBean("movie1",Movies.class);  //Another method without type casting
	      
	      
	      //Method 2 : Lazy / On Demand
	      
	      //BeanFactory factory = new XmlBeanFactory(new ClassPathResource("NewFile.xml")); //This is lazy retrieval...constructor will only get called upon creation of instance.
	      //Movies obj = factory.getBean("movie1",Movies.class);
	      
	      System.out.println("Name a nice movie: " + obj.getMovie_name());
	      ((AbstractApplicationContext) context).close();
	}
 
}