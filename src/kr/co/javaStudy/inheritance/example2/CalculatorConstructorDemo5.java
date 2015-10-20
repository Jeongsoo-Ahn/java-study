package kr.co.javaStudy.inheritance.example2;

public class CalculatorConstructorDemo5 {

	public static void main(String[] args) {
		SubtractionableCalculator c1 = new SubtractionableCalculator(10, 20);
		c1.sum();
		c1.avg();
		c1.subtract();
	}

}

class Calculator {
	int left, right;
	
	public Calculator(){}
	
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void setOprands(int left, int right){
		this.left = left;
		this.right = right;
	}
	
	public void sum(){
		System.out.println(this.left+this.right);
	}
	
	public void avg(){
		System.out.println((this.left + this.right) / 2);
	}
}

class SubtractionableCalculator extends Calculator {
	
	public SubtractionableCalculator (int left, int right) {
//		this.left = left;
//		this.right = right;
		
		super(left, right);
		
		/** 부모클래스의 초기화가 된 이후에 하위 클래스의 초기화 작업이 되어야 한다. */
	}
	
	public void subtract(){
		System.out.println(this.left - this.right);
	}
}