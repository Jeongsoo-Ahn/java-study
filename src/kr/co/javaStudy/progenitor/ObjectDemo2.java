package kr.co.javaStudy.progenitor;

class Student2 implements Cloneable{
	String name;
	
	Student2(String name){
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class ObjectDemo2 {

	public static void main(String[] args) {
		Student2 s1 = new Student2("Dustin");
		
		try {
			Student2 s2 = (Student2)s1.clone();
			System.out.println(s1.name);
			System.out.println(s2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
