package kr.co.javaStudy.constant2;

class Fruit5 {
	public static final Fruit5 APPLE  = new Fruit5();
	public static final Fruit5 PEACH  = new Fruit5();
	public static final Fruit5 BANANA  = new Fruit5();
}

class Company5 {
	public static final Company5 GOOGLE  = new Company5();
	public static final Company5 APPLE  = new Company5();
	public static final Company5 ORACLE  = new Company5();
}


public class ConstantDemo5 {

	public static void main(String[] args) {
//		if (Fruit5.APPLE == Company5.APPLE) {
//			System.out.println("과일 APPLE과 회사 APPLE은 같다.");	
//		}
		Fruit5 type = Fruit5.APPLE;
		
//		switch(type){
//		case FRUIT.APPLE:
//			System.out.println(57 + " kcal");
//			break;
//		case FRUIT.PEACH:
//			System.out.println(34 + " kcal");
//			break;
//		case FRUIT.BANANA:
//			System.out.println(93 + " kcal");
//			break;
//		}
	}

}
