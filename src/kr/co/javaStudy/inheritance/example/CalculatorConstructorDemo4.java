package kr.co.javaStudy.inheritance.example;

public class CalculatorConstructorDemo4 {

	public static void main(String[] args) {
		SubtractionableCalculator c1 = new SubtractionableCalculator(10, 20);
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
		System.out.println(this.left+this.right);
	}
	
	public void avg(){
		System.out.println((this.left + this.right) / 2);
	}
}

class SubtractionableCalculator extends Calculator {
	
	public SubtractionableCalculator (int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void subtract(){
		System.out.println(this.left - this.right);
	}
}