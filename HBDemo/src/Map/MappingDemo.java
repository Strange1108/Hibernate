package Map;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MappingDemo {
	public static void main(String[] args) {
		Session session = MapUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		
		e1.setEid(1);
		e1.setName("Mjstar");
		
		e2.setEid(2);
		e2.setName("Yash");
		
		Project p1 = new Project();
		Project p2 = new Project();
		
		p1.setPid(12);
		p1.setProjectName("AQM Model"); 
		
		p2.setPid(14);
		p2.setProjectName("Computer Network");
		
		List<Emp> list1 = new ArrayList<Emp>();
		List<Project> list2 = new ArrayList<Project>();

		list1.add(e1);
		list1.add(e2);
		
		list2.add(p1);
		list2.add(p2);
		
		e1.setProjects(list2);
		p2.setEmps(list1);
		 
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);

		tx.commit();
		session.close();

	}
};