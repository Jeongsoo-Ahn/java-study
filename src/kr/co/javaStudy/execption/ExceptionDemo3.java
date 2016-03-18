package kr.co.javaStudy.execption;

class A3{
	
    private int[] arr = new int[3];
    
    A3(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
    
    public void z(int first, int second){
    	try {
    		System.out.println(arr[first] / arr[second]);
    	} catch(ArrayIndexOutOfBoundsException e){
    		System.out.println("ArrayIndexOutOfBoundsException");
    	} catch(ArithmeticException e){
    		System.out.println("ArithmeticException");
    	} catch(Exception e){
        	System.out.println("Exception");
        } finally {
        	System.out.println("Finally");
        }
 
    }
}
 
public class ExceptionDemo3 {
    public static void main(String[] args) {
        A3 a = new A3();
        a.z(10, 0);
        a.z(1, 0);
        a.z(2, 1);
    }
}