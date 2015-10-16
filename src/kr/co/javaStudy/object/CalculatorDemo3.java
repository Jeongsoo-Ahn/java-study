package kr.co.javaStudy.object;

public class CalculatorDemo3 {

	public static void main(String[] args) {
		int left, right;
		 
        left = 30;
        right = 70;
 
        sum(left, right);
        avg(left, right);
 
        left = 20;
        right = 40;
 
        sum(left, right);
        avg(left, right);
	}
	
    public static void avg(int left, int right) {
        System.out.println((left + right) / 2);
    }
 
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }

}
