package Demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CascaseExample {
	public static void main(String[] args) {
		Session session = Util.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Question q1 = new Question();
		
		q1.setQuestionId(572);
		q1.setQuestion("What is spring framework");
		
		Answer a1 = new Answer(23426, "Use for Devlopement", q1);
		Answer a2 = new Answer(23426, "desktop", q1);
		Answer a3 = new Answer(23426, "learn by programmers", q1);

		List<Answer> list = new ArrayList<>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		
		q1.setAnswers(list);
		
		session.save(q1);
		session.save(a1);
		session.save(a2);
		session.save(a3);
		tx.commit();
		
		session.close();
	}
};

