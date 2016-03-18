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
		
		String a1 = new String("aaa");
		String a2 = new String("aaa");
		
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		
		System.out.println(a==new Test().c);
	}
	// 동일성비교 (==)
	// 동등성비교 (equals)
	
	// Permanent Generation (pergem) - Static Area
}


class Test{
	String c =  "Hello World";
}