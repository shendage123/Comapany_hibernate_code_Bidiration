package Company_bi_PECM27.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Company_bi_PECM27.DTO.Company;
import Company_bi_PECM27.DTO.Employee;

public class MainController {
	public static void main(String[] args) {
		
		
		
		 Company company=new Company();
		  company.setName("TCS");
		  company.setGst(1324);
		  
		  
		  
		  Employee e1=new Employee() ;
		  e1.setName("shubham");
		  e1.setPhone(908727276l);
		  e1.setAddressString("Indor");
		  e1.setCompany(company);
		  
		  Employee e2=new Employee() ;
		  e2.setName("shubham");
		  e2.setPhone(908727276l);
		  e2.setAddressString("Indor");
		  e2.setCompany(company);
		  
		  
		  Employee e3=new Employee() ;
		  e3.setName("shubham");
		  e3.setPhone(908727276l);
		  e3.setAddressString("Indor");
		  e3.setCompany(company);
		  
		  
		  List<Employee>employees=new ArrayList<Employee>();
		  employees.add(e1);
		  employees.add(e2);
		  employees.add(e3);
		  
		  company.setEmployees(employees);
		  
		  EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("rajath");
		  EntityManager entityManager= entityManagerFactory.createEntityManager();
		  EntityTransaction entityTransaction= entityManager.getTransaction();
		  
		  entityTransaction.begin();
		//  entityManager.persist(company);
		  entityManager.persist(e1);
		  entityManager.persist(e2);
		  entityManager.persist(e3);
		  entityTransaction.commit();
		  
		 
	}

}
