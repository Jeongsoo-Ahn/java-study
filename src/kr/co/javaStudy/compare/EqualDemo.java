package kr.co.javaStudy.compare;

public class EqualDemo {

	public static void main(String[] args) {
		System.out.println(1==2);
		System.out.println(1==1);
		System.out.println("one"=="two");
		System.out.println("one"=="one");
		
		String a = "one";
		String b = "one";
		String c = "two";
		
		System.out.println(a==b);
		System.out.println(a==c);
	}

}
