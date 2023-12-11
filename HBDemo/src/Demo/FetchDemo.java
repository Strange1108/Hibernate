package Demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class FetchDemo {

	public static void main(String args[]){
		Session session = Util.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
	   
		Student student = (Student)session.get(Student.class, "Mjstar");
		System.out.println(student);
		tx.commit();
		session.close();
	}  
}
