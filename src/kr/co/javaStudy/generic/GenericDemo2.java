package kr.co.javaStudy.generic;

class StudentInfo2 {
	public int grade;
	StudentInfo2(int grade){this.grade = grade;}
}

class StudentPerson2 {
	public StudentInfo2 info;
	StudentPerson2(StudentInfo2 info){this.info = info;}
}

class EmployeeInfo2 {
	public int rank;
	EmployeeInfo2 (int rank){this.rank = rank;}
}

class EmployeePerson2 {
	public EmployeeInfo2 info;
	EmployeePerson2(EmployeeInfo2 info){this.info = info;}
}

public class GenericDemo2 {
	
	public static void main(String[] args) {
		StudentInfo2 si = new StudentInfo2(2);
		StudentPerson2 sp = new StudentPerson2(si);
		System.out.println(sp.info.grade);
		EmployeeInfo2 ei = new EmployeeInfo2(1);
		EmployeePerson2 ep = new EmployeePerson2(ei);
		System.out.println(ep.info.rank);
	}
	
}
