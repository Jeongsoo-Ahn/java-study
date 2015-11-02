package kr.co.javaStudy.execption;

class DivideException extends RuntimeException {
	DivideException(){
		super();
	}
	
	DivideException (String message){
		super(message);
	}
}

class Calculator4{
    int left, right;
    public void setOprands(int left, int right){
    	this.left = left;
        this.right = right;
    }
    
    public void divide(){
    	if (this.right==0){
    		throw new DivideException("0으로 나눌 수 없습니다.");
    	}
    	System.out.print(this.left/this.right);
    }
} 
public class CalculatorDemo4 {
    public static void main(String[] args) {
        Calculator4 c1 = new Calculator4();
        c1.setOprands(10, 0);
        c1.divide();
    }
}