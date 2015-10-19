package kr.co.javaStudy.scope;

public class ScopeDemo {

	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {
			a();
			System.out.println(i);
		}
		
//		int i = 0;
	}
	
	static void a(){
		int i = 0;
	}

}
