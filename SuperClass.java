import java.util.Scanner;

class SuperClass1 {
	int a, b; // ÇÊµå
	public void setA(int a) {
		this.a = a; // ÇÊµå a°ª ¼³Á¤
	}
	public void setB(int b) {
		this.b = b; // ÇÊµå b°ª ¼³Á¤
	}
	public void sum() {
		System.out.println("µ¡¼À : " + (a + b));
	}
	public void substract() {
		System.out.println("»¬¼À : " + (a - b));
	}
}

class SubClass extends SuperClass1 {
	public void mul() {
		System.out.println("°ö¼À : " + a * b);
	}
	public void div() {
		System.out.println("³ª´°¼À : " + a / b);
	}
}

public class SuperClass {
	public static void main(String[] args) {
		System.out.println("2°³ÀÇ Á¤¼ö ÀÔ·Â");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		SubClass sub = new SubClass();
		sub.setA(a); // ¸Å°³°ª Àü´Þ
		sub.setB(b); // ¸Å°³°ª Àü´Þ
		sub.sum();
		sub.substract();
		sub.mul();
		sub.div();
		
	sc.close();
	}
}
