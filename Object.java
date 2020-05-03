class Fa{
	void ma() {
		System.out.println("마마마마마마");
}	//인스턴스 메소드
	static void ga() {
		System.out.println("가가가가가가");
	}	//스태틱 메소드
}
public class Object {
	public static void main(String[] args) {
		
		Fa fa = new Fa();	//객체 선언 과 객체생성
		
		fa.ma();
		
		Fa.ga();
	}
}
