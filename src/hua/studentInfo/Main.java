package hua.studentInfo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)  {

		// Δοκιμή της βάσης
		
		SessionFactory factory=new Configuration()
						   .configure("/hua/props/hibernate-config.xml")
						   .addAnnotatedClass(Student.class)
						   .buildSessionFactory();
		
		factory.close();
		

//		ApplicationContext context = new ClassPathXmlApplicationContext("hua/beans/beans.xml");
//
//		DataSource dataSource = context.getBean("dataSource", DataSource.class);
//
//
//		StudentDAO studentDAO = context.getBean("studentDAO", StudentDAO.class);
//
//		List<Student> students = studentDAO.getStudents();
//
//		System.out.println("Message from main\nΦοιτητές στον πίνακα students της βάσης:");
//
//		for (Student student : students) {
//
//			System.out.println(student);
//		}
//
//		System.out.println("Goodbye from main");
//
//		((ClassPathXmlApplicationContext) context).close();

	}

}
