package Demo;

//import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SrudentDemo {

	public static void main(String args[])throws IOException{
		Session session = Util.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Student s1 = new Student();
		Certificate C1 = new Certificate();
		C1.setCource("IT");
		C1.setDuration("2 year");
		s1.setName("Yash");
		s1.setRollno(106);
		s1.setCerti(C1);
		
		
		//Creating object of Address Class
		Address ad = new Address();
		ad.setStreet("Street3");
		ad.setCity("Lucknow");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(4231.234);

		//Reading Image
//		@SuppressWarnings("resource")
//		FileInputStream fis = new FileInputStream("resources/Screenshot (32).png");
//		byte[] data = new byte[fis.available()];
//		fis.read(data);
//		ad.setImage(data);
//		 Address Ad = (Address) session.get(Address.class, new Integer(1));
//		 System.out.println(Ad);
//		
//		Address student = (Address)session.get(Address.class, 1);
//		System.out.println(student.getCity());
		session.save(s1);
		session.save(ad);

		
		tx.commit();
		session.close();
	}  
}
