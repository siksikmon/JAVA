package vendingmachine;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import static java.lang.System.out;

//오류이유 = 인터페이스의 abstract 변수들을 아직 전부 다 오버라이딩 해주지 않았기 때문이다.
public class MachineActlmpl implements MachineAct {
	Scanner sc = new Scanner(System.in);
	
	ArrayList<MachineVO> list = new ArrayList<>();
	
	private int remain_money = 0;
	
	@Override
	public void insert_Coin() {
		int chr;
		
		out.println("돈을 넣어주세요.");
		out.println("1:5000원 2:1000원 3:500원 4:100원 5:잔돈반환");
		
		chr = sc.nextInt();
		
		switch(chr) {
		
		case 1:
			remain_money = remain_money+5000;
			out.println("투입금액:5000원");
			break;
		case 2:
			remain_money = remain_money+1000;
			out.println("투입금액:1000원");
			break;
		case 3:
			remain_money = remain_money+500;
			out.println("투입금액:500원");
			break;
		case 4:
			remain_money = remain_money+100;
			out.println("투입금액:100원");
			break;
		case 5:
			remain_money = remain_money-remain_money;
			out.println("0원");
			break;
		}
		
		out.println("사용 가능 금액:"+remain_money);
		 
	}
	
	@Override
	public void return_Coin() {
		if(remain_money==0) {
			out.println("반환할 돈이 없습니다.");
		}
		else if(remain_money>0){
			out.println("반환할 수 있는 금액:"+remain_money+"원");
			remain_money = remain_money-remain_money;
			out.println("반환완료");
			out.println("사용 가능 금액:"+remain_money);
		}
	}
	
	@Override
	public void enter_Menu() {
		MachineVO vo = new MachineVO();
		
		out.println("자판기 메뉴 등록");
		
		out.println("메뉴 이름 ?");
		
		vo.setDrink_name(sc.next());
		
		out.println("메뉴 가격 ?(숫자만 입력)");
		
		vo.setDrink_price(sc.nextInt());
		
		out.println("재고 등록(채울 개수)");
		
		vo.setDrink_stock(sc.nextInt());

		list.add(vo);
		
		out.println("등록 완료");
	}
	
	@Override
	public void print_Menu() {
		out.println("메뉴");
		
		MachineVO vo = new MachineVO();
		
		Iterator<MachineVO> it = list.iterator();
		while(it.hasNext()) {
			vo = it.next();
			
			out.println("제품명:"+vo.getDrink_name()+"");
			out.println("가격:"+vo.getDrink_price()+"");
			out.println("재고 개수:"+vo.getDrink_stock()+"");
			
			out.println();
		}
		
		
	}
	
	@Override
	public void choice_Menu() {
		out.println("메뉴 선택");
		
		print_Menu();
		
		out.println();
		
		String s;
		MachineVO vo = new MachineVO();
		Iterator<MachineVO> it = list.iterator();
		
		out.println("원하는 제품명 입력");
		
		s = sc.next();
		
		while(it.hasNext() ) {
			vo = it.next();
			
			if(s.equals(vo.getDrink_name())) {
				if(vo.getDrink_stock()==0) {
					out.println("재고가 없습니다.");
					break;
				}
				
				if(remain_money-vo.getDrink_price()<0) {
					out.println("잔액이 부족합니다.");
					break;
				}
				
				remain_money = remain_money - vo.getDrink_price();
				vo.setDrink_stock(vo.getDrink_stock()-1);
				out.println(vo.getDrink_name()+"출력완료,남은돈"+
				remain_money+"재고:"+vo.getDrink_stock());
			}
		}
	}
	
	@Override
	public void enter_Stock() {
		out.println("재고 충전");
		 String s;
		 int stock;
		 MachineVO vo = new MachineVO();
		 print_Menu();
		 
		 out.println();
		 
		 out.println("충전할 음료 명 입력");
		 
		 s = sc.next();
		 
		Iterator<MachineVO> it = list.iterator();
		
		out.println("충전할 재고 수량 입력");
		
		stock = sc.nextInt();
		
		while(it.hasNext()) {
			vo = it.next();
			
			if(s.equals(vo.getDrink_name())) {
				vo.setDrink_stock(vo.getDrink_stock()+stock);
				out.println(vo.getDrink_name()+"충전완료 재고:"+vo.getDrink_stock());
				break;
			}
		}


	}
	
	
	@Override
	public void delete_Menu() {
		out.println("삭제할 제품명 입력");
		
		String s;
		MachineVO vo = new MachineVO();
		print_Menu();
		
		s = sc.next();
		
		Iterator<MachineVO> it = list.iterator();
		
		while(it.hasNext()) {
			vo =it.next();
			
			if(s.equals(vo.getDrink_name())) {
				list.remove(vo);
				out.println("삭제 완료.");
				break;
			}
		}
	}
	
	@Override
	public void update_Menu() {
		out.println("수정할 제품 명 입력");
		String s;
		MachineVO vo = new MachineVO();
		print_Menu();
		
		s = sc.next();
		
		Iterator<MachineVO> it = list.iterator();
		
		while(it.hasNext()) {
			vo = it.next();
			
			if(s.equals(vo.getDrink_name())) {
				out.println("(수정) 메뉴 이름 ?");
				vo.setDrink_name(sc.next());
				out.println("(수정) 메뉴 가격 ?(숫자만 입력)");
				vo.setDrink_price(sc.nextInt());
				out.println("(수정) 재고 입력");
				vo.setDrink_stock(sc.nextInt());
				out.println("수정완료");
				break;				
			}
		}
	}
	
	
	
	
	
	
	
	
}

















