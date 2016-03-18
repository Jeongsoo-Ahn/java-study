package kr.co.javaStudy.condition;

public class SwitchDemo {

	public static void main(String[] args) {
		System.out.println("swtich(1)");
		switch(1) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
		
		System.out.println("swtich(2)");
		switch(2) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
		
		System.out.println("swtich(3)");
		switch(3) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
	}
	
	// IF 절에서 가장 많이 비교하게 될 구분을 가장 위에 태우는 것이 좋다.

}
