package vendingmachine;

import java.util.Scanner;
import static java.lang.System.out;

public class MachineApp {
	public static void main(String[] args) {
		MachineActlmpl mc = new MachineActlmpl();	
		Scanner sc = new Scanner(System.in);
		
		int ch;
		int chs;
		
		while(true) {
			do {
				out.println("1.���� ���� 2.�ܵ� ��ȯ 3.�޴� ���� 4.������ �޴� 5.����=>");
				ch =sc.nextInt();
			}while(ch<1||ch>5); 
				
			if(ch==5)
				break;
			
			if(ch>=1||ch<=5) {
			switch(ch) {
			case 1:
				mc.insert_Coin();
				break;
			case 2:
				mc.return_Coin();
				break;
			case 3:
				mc.choice_Menu();
				break;
			case 4:
				while(true) {
					do {
						out.println("1.�޴� ��� 2.�޴� ���� 3.�޴� ���� 4.��� ��� 5.����=>");
						chs =sc.nextInt();

					}while(chs<1||chs>5); 
					
					if(chs==5)
						break;
					
					switch(chs) {
					case 1:
						mc.enter_Menu();
						break;
					case 2:
						mc.delete_Menu();
						break;
					case 3:
						mc.update_Menu();
						break;
					case 4:
						mc.enter_Stock();
						break;
				}
				
			}
			break;
			
		}
			}
	}
		sc.close();
}
	
}