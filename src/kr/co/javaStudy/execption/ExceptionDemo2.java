package kr.co.javaStudy.execption;

class A2{
	
    private int[] arr = new int[3];
    
    A2(){
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
        }
    }
}
 
public class ExceptionDemo2 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.z(10, 0);
        a.z(1, 0);
        a.z(2, 1);
    }
}