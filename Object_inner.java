class Outer{
	void ma() {
		System.out.println("������������");
}	//�ν��Ͻ� �޼ҵ�
	static void ga() {
		System.out.println("������������");
	}	//����ƽ �޼ҵ�
	
	class Inner01{
		void ta() {
			System.out.println("ŸŸŸŸŸŸ");
		}			
		} 
	void Ra(){
		class Inner02{
			void ra() {
				System.out.println("�������");
			}	
			
		}
		Inner02 ol = new Inner02();
		ol.ra();
	}
	}

public class Object_inner {
	public static void main(String[] args) {
		
//		Fa fa = new Fa();	//��ü ���� �� ��ü����
//		
//		fa.ma();
//		
//		Fa.ga();
//		
		Outer ou = new Outer();   //�ܺ� Ŭ���� ��ü ����� ����
		ou.ma();	
		Outer.ga();
		
		Outer.Inner01 oi =ou.new Inner01(); 	//����Ŭ���� ��ü ����� ����	
		oi.ta();
		
		ou.Ra();
	}
}
