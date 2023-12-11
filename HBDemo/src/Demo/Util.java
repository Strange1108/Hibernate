package Demo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {
	@SuppressWarnings("deprecation")
	public static SessionFactory getSessionFactory(){
  return new Configuration().configure().buildSessionFactory();
}
}
