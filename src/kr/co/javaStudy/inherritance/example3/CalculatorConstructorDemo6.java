package kr.co.javaStudy.inherritance.example3;

public class CalculatorConstructorDemo6 {

	public static void main(String[] args) {
		Ccc c = new Ccc(1,2);
		
		c.aMethod();
		c.bMethod();
		c.cMethod();
	}

}

//최상위 부모
class Aaa {
	
	int a, b;
	
	public Aaa(){}
	
	public Aaa(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("2");
	}
	
	public void aMethod(){
		System.out.println("call aaa Method" + this.a + "," + this.b);
	}
}

class Bbb extends Aaa{
	public Bbb(){}
	
	public Bbb(int a, int b){
		super(a,b);
		System.out.println("1");
	}
	
	public void bMethod(){
		System.out.println("call bbb Method" + this.a + "," + this.b);
	}
}

class Ccc extends Bbb{
	public Ccc(){}
	
	public Ccc(int a, int b){
//		this.a = a;
//		this.b = b;
		
		super(a, b);
		System.out.println("0");
	}
	
	public void cMethod(){
		System.out.println("call ccc Method" + this.a + "," + this.b);
	}
}
