package Note;

import java.util.Scanner;

public class NotePad {
	public static void main(String[] args) {
		NoteResearch nr = new NoteResearch();
		Scanner sc = new Scanner(System.in);

		
		int ch;
		while(true) {
			do {
				System.out.println("1:���� �Է� 2:���� ��� 3:����");
				ch = sc.nextInt();
			}while(ch<1||ch>3);
			
			if(ch==3)
				break;
			
			if(ch>=1||ch<=3) {
			switch(ch) {
			case 1:
				nr.pull_sentence();
				break;
			case 2:
				nr.show_sentence();
				break;
			}
	
			
			}
	
		}
		sc.close();
	}
}
