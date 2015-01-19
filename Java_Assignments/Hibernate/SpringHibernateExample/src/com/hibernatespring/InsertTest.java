package com.hibernatespring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class InsertTest {
	public static void main(String[] args) {

		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		EmployeeDao dao = (EmployeeDao) factory.getBean("d");

		Employee e = new Employee();
		e.setId(116);
		e.setName("naveen");
		e.setSalary(80000);

		
//		dao.saveEmployee(e);
//		dao.updateEmployee(e);
//		dao.deleteEmployee(e);
//		dao.getEmployees();
		dao.getById(114);

	}
}