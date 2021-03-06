package kr.co.javaStudy.generics2;

class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){this.rank = rank;}
}

class Person<T, S>{
	public T info;
	public S id;
	
	Person(T info, S id){
		this.info = info;
		this.id = id;
	}
	
	public <U> void printInfo(U info){
		System.out.println(info);
	}
}

public class GenericDemo {

	public static void main(String[] args) {
		
//		Integer id = new Integer(2);
//		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(new EmployeeInfo(1), id);
//		System.out.println(p1.id.intValue());
		
		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(10);
		Person p1 = new Person(e, i);
		
		p1.<EmployeeInfo>printInfo(e);
	}

}
