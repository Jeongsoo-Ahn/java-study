package kr.co.javaStudy.operator;

public class DivisionDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		float d = 3.0F;
		
		System.out.println(a/b);
		System.out.println(c/d);
		System.out.println(a/d);
		System.out.println("----------------");
		System.out.println(Math.ceil(c/d));
		System.out.println(Math.ceil(a/d));
		System.out.println(Math.round(c/d));
		System.out.println(Math.round(a/d));
		System.out.println(Math.floor(c/d));
		System.out.println(Math.floor(a/d));
		
		int x = 3;
		int y = 10;
		
		System.out.println(y/x);
		System.out.println(Math.round(y/x));
	}

}
