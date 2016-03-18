package kr.co.javaStudy.constant2;

enum Fruit7 {
	APPLE("RED"),
	PEACH("PINK"),
	BANANA("YELLOW");
	
	private String color;
	
	public String getColor(){
		return this.color;
	}
	
	Fruit7(String color) {
		System.out.println("Called Constructor" + this);
		this.color = color;
	}
}

public class ConstantDemo7 {

	public static void main(String[] args) {
		Fruit7 type = Fruit7.PEACH;
		
		switch(type){
		case APPLE:
			System.out.println(57 + " kcal, color is " + Fruit7.APPLE.getColor());
			break;
		case PEACH:
			System.out.println(34 + " kcal, color is " + Fruit7.PEACH.getColor());
			break;
		case BANANA:
			System.out.println(93 + " kcal, color is " + Fruit7.BANANA.getColor());
			break;
		}
	}

}
