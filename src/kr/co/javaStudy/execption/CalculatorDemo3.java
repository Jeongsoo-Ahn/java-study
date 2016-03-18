package kr.co.javaStudy.execption;

class Calculator3{
    int left, right;
    public void setOprands(int left, int right){
    	
//    	if (right == 0) {
//    		throw new IllegalArgumentException("두번째 값이 0이면 안됩니다.");
//    	}
    	
        this.left = left;
        this.right = right;
    }
    
    public void divide(){
    	
    	if (this.right == 0){
    		throw new ArithmeticException("0으로 나눌 수 없습니다.");
    	}
    	
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(Exception e){
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        }
    }
} 
public class CalculatorDemo3 {
    public static void main(String[] args) {
        Calculator3 c1 = new Calculator3();
        c1.setOprands(10, 0);
        c1.divide();
    }
}