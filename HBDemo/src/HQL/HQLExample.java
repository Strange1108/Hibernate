package HQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import Demo.Student;

public class HQLExample {
	public static void main(String[] args) {
		Session session = MapUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		//HQL Syntex
		String query = "from Student where rollno=:x";
		Query q = session.createQuery(query);
		
		//Single-unique
		//multiple list
		q.setParameter("x", 2);
		List<Student> list = q.list();
		
		for(Student student:list)
		{
			System.out.println(student.getName());
		}
		/* 
		 * Delete Query
		System.out.println("...........................");
		String query2 = "delete from Student where rollno=2";
		Query q2 = session.createQuery(query2);

		int r = q2.executeUpdate();
		System.out.println("Deleted");
		System.out.println(r);
 */
		
		/*Update Query
		Query q2 = session.createQuery("update Student set rollno=2 where name='Sandip'");
		int r = q2.executeUpdate();
		System.out.println(r);
*/
		/*how to execute join query
		Query q3 = session.createQuery("select q.question, q.questionId, a.answer from Question as q INNER JOIN q.answer as a");
		List<Student> list3 = q3.list();		
		for(Student arr:list3)
		{
			System.out.println(arr.getName());
		}*/
		
		
		tx.commit();
		session.close();

	}
};