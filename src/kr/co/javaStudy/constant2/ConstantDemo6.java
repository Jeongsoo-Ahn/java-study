package kr.co.javaStudy.constant2;

enum Fruit6 {
	APPLE, PEACH, BANANA;
	
	Fruit6() {
		System.out.println("Called Constructor");
	}
}

enum Company6 {
	GOOGLE, APPLE, ORACLE;
}


public class ConstantDemo6 {

	public static void main(String[] args) {
//		if (Fruit5.APPLE == Company5.APPLE) {
//			System.out.println("과일 APPLE과 회사 APPLE은 같다.");	
//		}
		Fruit6 type = Fruit6.APPLE;
		
		switch(type){
		case APPLE:
			System.out.println(57 + " kcal");
			break;
		case PEACH:
			System.out.println(34 + " kcal");
			break;
		case BANANA:
			System.out.println(93 + " kcal");
			break;
		}
	}

}
