import java.util.Scanner;

class Test{
	class Ta{
		void Tb(){
			System.out.println("������!");
		}
	}
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("10�� �ڸ��� 1�� �ڸ��� ������ �Ǻ��մϴ�.");
	    System.out.println("�׸��Ϸ��� 0�� �Է��ϼ���.");
	    while (true) {
	    System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
	    int num = 0;
	    
	    Test Tc = new Test();
	    Test.Ta Td = Tc.new Ta();
	    
	   
	        try{
	            num = sc.nextInt();
	        }catch(Exception e){
	            System.out.print("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.>>");
	            sc = new Scanner(System.in);
	        }finally {
	            if (num == 0) {
	            	Td.Tb();
	                
	            }else if ((num < 10) || (num > 99)) {
	                System.out.print("2�ڸ��� ������ �ƴմϴ�. �ٽ� �Է��ϼ���.>>");
	
	            }else {
	                if (num % 10 == num / 10) {
	                    System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
	                    System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
	
	                }else{
	                    System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
	                    System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
	                }
	            }
	        }
	
	    }
	    
	}
}