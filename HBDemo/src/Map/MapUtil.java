package Map;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MapUtil {
	@SuppressWarnings("deprecation")
	public static SessionFactory getSessionFactory(){
  return new Configuration().configure().buildSessionFactory();
}
}
