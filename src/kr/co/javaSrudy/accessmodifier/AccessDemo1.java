package kr.co.javaSrudy.accessmodifier;

class A {
	public String y(){
		return "public String y()";
	}
	
	private String z() {
		return "private String z()";
	}
	
	public String x() {
		return z();
	}
}

public class AccessDemo1 {

	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a.y());
//		System.out.println(a.z());
		System.out.println(a.x());
		
	}

}
