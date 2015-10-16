package kr.co.javaStudy.array;

public class ForEachDemo {

	public static void main(String[] args) {
		
		int [] a = {1,2,3};
		
		for (int e : a) {
			System.out.println(e + " : 상당을 받았습니다.");
		}
		
		String [] x = new String[100000000];
		x[0] = "1";
		System.out.println(x[0]);
		
	}

}
