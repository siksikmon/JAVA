import java.util.Scanner;

class Test{
	class Ta{
		void Tb(){
			System.out.println("하하하!");
		}
	}
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("10의 자리와 1의 자리가 같은지 판별합니다.");
	    System.out.println("그만하려면 0을 입력하세요.");
	    while (true) {
	    System.out.print("2자리수 정수 입력(10~99)>>");
	    int num = 0;
	    
	    Test Tc = new Test();
	    Test.Ta Td = Tc.new Ta();
	    
	   
	        try{
	            num = sc.nextInt();
	        }catch(Exception e){
	            System.out.print("잘못된 입력입니다. 다시 입력하세요.>>");
	            sc = new Scanner(System.in);
	        }finally {
	            if (num == 0) {
	            	Td.Tb();
	                
	            }else if ((num < 10) || (num > 99)) {
	                System.out.print("2자리수 정수가 아닙니다. 다시 입력하세요.>>");
	
	            }else {
	                if (num % 10 == num / 10) {
	                    System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
	                    System.out.print("2자리수 정수 입력(10~99)>>");
	
	                }else{
	                    System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
	                    System.out.print("2자리수 정수 입력(10~99)>>");
	                }
	            }
	        }
	
	    }
	    
	}
}