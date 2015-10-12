package kr.co.javaStudy.casting;

public class CastingDemo {

	public static void main(String[] args) {
		double a = 3.0F;
		float b = 3.0F;
		
		int xx = 5;
		double yy = 5;
		
		System.out.println(a);
		System.out.println(b);
		
		//double c = Double.parseDouble(b);	//error
		double c = Double.parseDouble("" + b);
		
		
		System.out.println(c);
		//float c = 4.0; //error
		//float c = 4.0D; //error
		float d = 4;
		System.out.println(d);
		
		int x = 3;
		float y = 1.0F;
		double z = a + y;
		
		System.out.println(z);
		
		int aa = 4;
		float bb = 5.0F;
		
		System.out.println(aa + bb);
	}

}
