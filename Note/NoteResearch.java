package Note;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class NoteResearch implements NoteAct {
	Scanner sc = new Scanner(System.in);
	Scanner scr = new Scanner(System.in);

	ArrayList<NoteVO> list = new ArrayList<>();
	
	@Override
	public void pull_sentence() {
		NoteVO vo = new NoteVO();
		
		System.out.println("���� ���� �Է�:");
		vo.setSentence_name(sc.next());
		

		System.out.println("���� ���� �Է�:");
		vo.setSentence_main(scr.next());
		list.add(vo);
		System.out.println("�Է� �Ϸ�");
	}
	
	@Override
	public void show_sentence() {
		NoteVO vo = new NoteVO();
		Iterator<NoteVO> it = list.iterator();
		while(it.hasNext()) {
			vo = it.next();
			
			System.out.println("���� ����:"+vo.getSentence_name());
			System.out.println("���� ����:"+vo.getSentence_main());

		}
		
	
	}
	
	
	
	
}
