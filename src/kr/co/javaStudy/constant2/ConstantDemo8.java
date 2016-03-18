package kr.co.javaStudy.constant2;

enum Fruit8 {
	APPLE("RED"),
	PEACH("PINK"),
	BANANA("YELLOW");
	
	private String color;
	
	public String getColor(){
		return this.color;
	}
	
	Fruit8(String color) {
		this.color = color;
	}
}

public class ConstantDemo8 {

	public static void main(String[] args) {
		
		for (Fruit8 f : Fruit8.values()){
			System.out.println(f + ", " + f.getColor());
		}
		
	}

}
