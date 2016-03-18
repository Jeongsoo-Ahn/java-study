package kr.co.javaStudy.overloading.example;

public class CalculatorDemo {

	public static void main(String[] args) {
		SubtractionableCalculator c1 = new SubtractionableCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.setOprands(10, 20, 30);
		c1.sum();
		c1.avg();

	}

}

class Calculator {
	int left, right;
	int third = 0;
	
	public void setOprands(int left, int right){
		System.out.println("Call setOprands(int left, int right)");
		this.left = left;
		this.right = right;
	}
	
	public void setOprands(int left, int right, int third){
		System.out.println("Call setOprands(int left, int right, int third)");
		this.setOprands(left, right);
//		this.left = left;
//		this.right = right;
		this.third = third;
	}
	
	public void sum(){
		System.out.println(this.left + this.right + this.third);
	}
	
	public void avg(){
		System.out.println((this.left + this.right + this.third) / 3);
	}
}

class SubtractionableCalculator extends Calculator {
	public void subtract(){
		System.out.println(this.left - this.right);
	}
}

