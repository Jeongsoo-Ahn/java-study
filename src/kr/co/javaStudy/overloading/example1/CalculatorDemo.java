package kr.co.javaStudy.overloading.example1;

class Calculator {
	int [] oprands;
	
	public void setOprands(int[] oprands){
		this.oprands = oprands;
	}
	
	public void sum(){
		int total = 0;
		for (int value : this.oprands){
			total += value;
		}
		System.out.println("total : " + total);
	}
	
	public void avg(){
		int total = 0;
		
		for (int value : this.oprands){
			total += value;
		}
		
		System.out.println(total/this.oprands.length);
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(new int[]{1,2,3,4,5,6,7,8,9,10});
		c1.sum();
		c1.avg();
		
		c1.setOprands(new int[]{10,20,30,40});
		c1.sum();
		c1.avg();
	}

}
