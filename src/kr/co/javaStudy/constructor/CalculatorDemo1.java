package kr.co.javaStudy.constructor;

public class CalculatorDemo1 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(10,20);
		c1.sum();
		c1.avg();

		Calculator c2 = new Calculator(30,40);
		c2.sum();
		c2.avg();
		
		
	}

}

class Calculator {
	int left, right;
	
	public Calculator(int left, int right){
		this.left = left;
		this.right = right;
	}
	
//	public Calculator(){
//		
//	}
	
	public void sum(){
		System.out.println(left+right);
	}
	
	public void avg(){
		System.out.println((left+right) / 2);
	}
}
