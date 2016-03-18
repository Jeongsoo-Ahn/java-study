package kr.co.javaStudy.generic;

class StudentInfo4 {
	public int grade;
	StudentInfo4(int grade){this.grade = grade;}
}

class EmployeeInfo4 {
	public int rank;
	EmployeeInfo4 (int rank){this.rank = rank;}
}

class Person4<T> {
	public T info;
	Person4(T info){this.info = info;}
}

public class GenericDemo4 {
	
	public static void main(String[] args) {
		Person4<EmployeeInfo4> p4 = new Person4<EmployeeInfo4>(new EmployeeInfo4(1));
		EmployeeInfo4 ei4 = p4.info;
		System.out.println(ei4.rank);
		
//		Person<String> p5 = new Person<String>("부장");
//		String ei5 = p5.info;
//		System.out.println(ei5.rank);
	}
	
}
