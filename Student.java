class Person2 {
	int age;
	public String name;
	protected int height;
	private int weight;
	public void setWeight(int weight){
		this.weight= weight;
	}

	

	public int getWeight(){

		return weight;

	}

}


class Student extends Person2 {

// Student 클래스가 Person 클래스를 상속받음

	void set(){

		age = 30;

		name = "홍길동";

		height = 175;

		setWeight (79);

	}
	
	public static void main(String[] args) {

		Student s = new Student(); // Student 객체 생성 

		s.set(); //Person클래스를 상속 받았기 때문에 Person클래스에 있는 매개변수를 사용할 수 있음.

		System.out.println("나이 : "+s.age+"\n이름 : "+s.name+"\n키 : "+s.height+"\n몸무게 : "+s.getWeight());

	}



	
}

	



