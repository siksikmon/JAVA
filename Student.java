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

// Student Ŭ������ Person Ŭ������ ��ӹ���

	void set(){

		age = 30;

		name = "ȫ�浿";

		height = 175;

		setWeight (79);

	}
	
	public static void main(String[] args) {

		Student s = new Student(); // Student ��ü ���� 

		s.set(); //PersonŬ������ ��� �޾ұ� ������ PersonŬ������ �ִ� �Ű������� ����� �� ����.

		System.out.println("���� : "+s.age+"\n�̸� : "+s.name+"\nŰ : "+s.height+"\n������ : "+s.getWeight());

	}



	
}

	



