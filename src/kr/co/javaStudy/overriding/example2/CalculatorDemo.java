package kr.co.javaStudy.overriding.example2;

public class CalculatorDemo {

	public static void main(String[] args) {
		SubtractionableCalculator c1 = new SubtractionableCalculator();
//		Calculator c1 = new Calculator();

		c1.setOprands(10, 20);
		c1.sum();
		System.out.println("avg is " + c1.avg() + ".");
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
	
	public int avg(){
		return (this.left + this.right) / 2;
	}
}

class SubtractionableCalculator extends Calculator {
	
	public void sum() {
		System.out.println("result is " + (this.left + this.right) + ".");
	}
	
	
	public int avg(){
//		return (this.left+this.right) / 2;
		return super.avg();
	}
	
	public void subtract(){
		System.out.println(this.left - this.right);
	}
}
