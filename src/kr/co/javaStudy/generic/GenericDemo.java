package kr.co.javaStudy.generic;

class Person<T>{
	public T info;
}

public class GenericDemo {

	public static void main(String[] args) {
		Person<String> p1 = new Person<String>();
		Person<StringBuilder> p2 = new Person<StringBuilder>();
		System.out.println(p1.info);
		System.out.println(p2.info);
	}

}