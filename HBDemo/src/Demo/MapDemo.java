package Demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MapDemo {
	public static void main(String[] args) {
		Session session = Util.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Question q1 = new Question();
		q1.setQuestionId(1234);
		q1.setQuestion("what is java");
		
		//Creating answer
		Answer answer =  new Answer();
		answer.setAnswerId(321);
		answer.setAnswer("Java is programing language");
		answer.setQuestion(q1);
		
		Answer answer1 =  new Answer();
		answer1.setAnswerId(123);
		answer1.setAnswer("with the help of java we can create software");
		answer1.setQuestion(q1);
		
		
		Answer answer2 =  new Answer();
		answer2.setAnswerId(213);
		answer2.setAnswer("java hase different types of frameworks");
		answer2.setQuestion(q1);
		
		List<Answer> list = new ArrayList<Answer>();
		list.add(answer);
		list.add(answer1);
		list.add(answer2);
		
		q1.setAnswers(list);
		
		//Session
		session.save(q1);
		session.save(answer);
		session.save(answer1);
		session.save(answer2);
		
		
		Question q = (Question)session.get(Question.class, 1234);
		System.out.println(q.getQuestion());
		for(Answer a: q.getAnswers())
		{
			System.out.println(a.getAnswer());
		}
		tx.commit();
		
		session.close();
	}
};


/*
 * #One-To-One#
 * public class MapDemo {
	public static void main(String[] args) {
		Session session = Util.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("what is java");
		
		//Creating answer
		Answer answer =  new Answer();
		answer.setAnswerId(343);
		answer.setAnswer("Java is programing language");
		q1.setAnswer(answer);
		
		
		Question q2 = new Question();
		q2.setQuestionId(242);
		q2.setQuestion("what is collection framework");
		
		//Creating answer
		Answer answer1 =  new Answer();
		answer1.setAnswerId(344);
		answer1.setAnswer("API to work with objects in java");
		q2.setAnswer(answer1);
		
		//Session
		session.save(q1);
		session.save(q2);
		session.save(answer);
		session.save(answer1);
		tx.commit();
		Question newQ = (Question) session.get(Question.class, 1212);
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getAnswer().getAnswer());
		session.close();
	}*/


/*##One-to-Many
 * 
 * public static void main(String[] args) {
		Session session = Util.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("what is java");
		
		//Creating answer
		Answer answer =  new Answer();
		answer.setAnswerId(343);
		answer.setAnswer("Java is programing language");
		answer.setQuestion(q1);
		
		Answer answer1 =  new Answer();
		answer1.setAnswerId(33);
		answer1.setAnswer("with the help of java we can create software");
		answer1.setQuestion(q1);
		
		
		Answer answer2 =  new Answer();
		answer2.setAnswerId(363);
		answer2.setAnswer("java hase different types of frameworks");
		answer2.setQuestion(q1);
		
		List<Answer> list = new ArrayList<Answer>();
		list.add(answer);
		list.add(answer1);
		list.add(answer2);
		
		q1.setAnswers(list);
		
		//Session
		session.save(q1);
		session.save(answer);
		session.save(answer1);
		session.save(answer2);
		
		
		Question q = (Question)session.get(Question.class, 1212);
		System.out.println(q.getQuestion());
		for(Answer a: q.getAnswers())
		{
			System.out.println(a.getAnswer());
		}
		tx.commit();
		
		session.close();
	}
	*/
 