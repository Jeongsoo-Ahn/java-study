package kr.co.javaStudy.object;

public class CalculatorDemo4 {

	public static void main(String[] args) {
		 Calculator c1 = new Calculator();		//객체가 된다. new할 때..
	     c1.setOprands(10, 20);
	     c1.sum();       
	     c1.avg();       
	          
	     Calculator c2 = new Calculator();
	     c2.setOprands(20, 40);
	     c2.sum();
	     c2.avg();
	}
	
    public static void avg(int left, int right) {
        System.out.println((left + right) / 2);
    }
 
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }
    
}

class Calculator{
    int left, right;
      
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
      
    public void sum(){
        System.out.println(this.left+this.right);
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}