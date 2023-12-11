package Demo;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmDemo {
	public static void main(String[] args) {
		Session session = Util.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Student s1 = new Student();
		s1.setRollno(4);
		s1.setName("Mjstar");
		
		Certificate c1 = new Certificate();
		c1.setCource("Jadav");
		c1.setDuration("1 hour");
		
		s1.setCerti(c1);
		session.save(s1);
		tx.commit();
		session.close();

	}
}
