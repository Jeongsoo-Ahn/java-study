package kr.co.javaStudy.generic;

class StudentInfo3 {
	public int grade;
	StudentInfo3(int grade){this.grade = grade;}
}

class EmployeeInfo3 {
	public int rank;
	EmployeeInfo3 (int rank){this.rank = rank;}
}

class Person3 {
	public Object info;
	Person3(Object info){this.info = info;}
}

public class GenericDemo3 {
	
	public static void main(String[] args) {
		Person4 p3 = new Person4("부장");
		EmployeeInfo4 ei = (EmployeeInfo4)p3.info;
	}
	
}
