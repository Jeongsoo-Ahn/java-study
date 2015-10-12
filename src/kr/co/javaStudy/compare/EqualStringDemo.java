package kr.co.javaStudy.compare;

public class EqualStringDemo {

	public static void main(String[] args) {
		String a = "Hello World";
		String b = new String("Hello World");
		String c = "Hello World";
		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}

}
