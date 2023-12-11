package Demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	private int rollno;
	private String name;
	
	
	private Certificate certi;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	@Id
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", Certi=" + certi + "]";
	}

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	
	
}
