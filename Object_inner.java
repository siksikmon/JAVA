class Outer{
	void ma() {
		System.out.println("마마마마마마");
}	//인스턴스 메소드
	static void ga() {
		System.out.println("가가가가가가");
	}	//스태틱 메소드
	
	class Inner01{
		void ta() {
			System.out.println("타타타타타타");
		}			
		} 
	void Ra(){
		class Inner02{
			void ra() {
				System.out.println("라라라라라라");
			}	
			
		}
		Inner02 ol = new Inner02();
		ol.ra();
	}
	}

public class Object_inner {
	public static void main(String[] args) {
		
//		Fa fa = new Fa();	//객체 선언 과 객체생성
//		
//		fa.ma();
//		
//		Fa.ga();
//		
		Outer ou = new Outer();   //외부 클래스 객체 선언과 생성
		ou.ma();	
		Outer.ga();
		
		Outer.Inner01 oi =ou.new Inner01(); 	//내부클래스 객체 선언과 생성	
		oi.ta();
		
		ou.Ra();
	}
}
