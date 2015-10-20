package kr.co.javaStudy.overriding.example1;

public class CalculatorDemo {

	public static void main(String[] args) {
//		SubtractionableCalculator c1 = new SubtractionableCalculator();
//		Calculator c1 = new Calculator();
		X c1 = new X();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.subtract();
	}

}

class Calculator {
	int left, right;
	
	public void setOprands(int left, int right){
		this.left = left;
		this.right = right;
	}
	
	public void sum(){
		System.out.println(this.left + this.right);
	}
	
	public void avg(){
		System.out.println((this.left + this.right) / 2);
	}
}

class SubtractionableCalculator extends Calculator {
	
	public void sum() {
		System.out.println("result is " + (this.left + this.right) + ".");
	}
	
	public void subtract(){
		System.out.println(this.left - this.right);
	}
}

class X extends SubtractionableCalculator {
//	public void sum() {
//		System.out.println("x method");
//	}	
}
