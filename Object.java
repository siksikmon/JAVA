class Fa{
	void ma() {
		System.out.println("������������");
}	//�ν��Ͻ� �޼ҵ�
	static void ga() {
		System.out.println("������������");
	}	//����ƽ �޼ҵ�
}
public class Object {
	public static void main(String[] args) {
		
		Fa fa = new Fa();	//��ü ���� �� ��ü����
		
		fa.ma();
		
		Fa.ga();
	}
}
