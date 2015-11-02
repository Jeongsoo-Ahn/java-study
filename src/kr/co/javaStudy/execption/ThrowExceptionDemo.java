package kr.co.javaStudy.execption;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class B {
	void run() throws IOException, FileNotFoundException {
		BufferedReader b = null;
		String input = null;
		b = new BufferedReader(new FileReader("out.txt"));
		
		input = b.readLine();
		
		System.out.println(input);
	}
}

class C {
	void run() throws IOException, FileNotFoundException {
		B b = new B();
		b.run();
	}
}

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		C c = new C();
		try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println("out.txt 이 없어용~");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
