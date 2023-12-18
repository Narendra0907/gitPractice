package Com.Controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Com.Entity.Course;
import Com.Entity.Employee;

public class deleteData {
	
	public static void delete_Employee() {
		Session s = HibConnection.getSession();
		Transaction t = s.beginTransaction();
		Course cou = (Course) s.get(Course.class, 1);
		List<Employee> emp = cou.getEmp();
		for(Employee aa:emp) {
		if(aa.getEmpname().equals("kiran")) {
			s.delete(aa);
		}
		}
		
		t.commit();
		s.close();
	
	}
	public static void main(String[] args) {
		delete_Employee();
	}
}
