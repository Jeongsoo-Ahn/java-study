package kr.co.javaStudy.array;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		
		String [] a = {"aaa","bbb","ccc","ddd"};
		
		for (int i=0; i<a.length; i++) {
			String b = a[i];
			System.out.println(b + " : 훈련을 받았습니다.");
			System.out.println(b + " : 훈련을 받았습니다.");
		}
		
	}

}
