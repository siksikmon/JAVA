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
		
		System.out.println("문장 제목 입력:");
		vo.setSentence_name(sc.next());
		

		System.out.println("문장 내용 입력:");
		vo.setSentence_main(scr.next());
		list.add(vo);
		System.out.println("입력 완료");
	}
	
	@Override
	public void show_sentence() {
		NoteVO vo = new NoteVO();
		Iterator<NoteVO> it = list.iterator();
		while(it.hasNext()) {
			vo = it.next();
			
			System.out.println("문장 제목:"+vo.getSentence_name());
			System.out.println("문장 내용:"+vo.getSentence_main());

		}
		
	
	}
	
	
	
	
}
