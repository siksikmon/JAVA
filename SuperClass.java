import java.util.Scanner;

class SuperClass1 {
	int a, b; // �ʵ�
	public void setA(int a) {
		this.a = a; // �ʵ� a�� ����
	}
	public void setB(int b) {
		this.b = b; // �ʵ� b�� ����
	}
	public void sum() {
		System.out.println("���� : " + (a + b));
	}
	public void substract() {
		System.out.println("���� : " + (a - b));
	}
}

class SubClass extends SuperClass1 {
	public void mul() {
		System.out.println("���� : " + a * b);
	}
	public void div() {
		System.out.println("������ : " + a / b);
	}
}

public class SuperClass {
	public static void main(String[] args) {
		System.out.println("2���� ���� �Է�");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		SubClass sub = new SubClass();
		sub.setA(a); // �Ű��� ����
		sub.setB(b); // �Ű��� ����
		sub.sum();
		sub.substract();
		sub.mul();
		sub.div();
		
	sc.close();
	}
}
