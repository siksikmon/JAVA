package vendingmachine;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import static java.lang.System.out;

//�������� = �������̽��� abstract �������� ���� ���� �� �������̵� ������ �ʾұ� �����̴�.
public class MachineActlmpl implements MachineAct {
	Scanner sc = new Scanner(System.in);
	
	ArrayList<MachineVO> list = new ArrayList<>();
	
	private int remain_money = 0;
	
	@Override
	public void insert_Coin() {
		int chr;
		
		out.println("���� �־��ּ���.");
		out.println("1:5000�� 2:1000�� 3:500�� 4:100�� 5:�ܵ���ȯ");
		
		chr = sc.nextInt();
		
		switch(chr) {
		
		case 1:
			remain_money = remain_money+5000;
			out.println("���Աݾ�:5000��");
			break;
		case 2:
			remain_money = remain_money+1000;
			out.println("���Աݾ�:1000��");
			break;
		case 3:
			remain_money = remain_money+500;
			out.println("���Աݾ�:500��");
			break;
		case 4:
			remain_money = remain_money+100;
			out.println("���Աݾ�:100��");
			break;
		case 5:
			remain_money = remain_money-remain_money;
			out.println("0��");
			break;
		}
		
		out.println("��� ���� �ݾ�:"+remain_money);
		 
	}
	
	@Override
	public void return_Coin() {
		if(remain_money==0) {
			out.println("��ȯ�� ���� �����ϴ�.");
		}
		else if(remain_money>0){
			out.println("��ȯ�� �� �ִ� �ݾ�:"+remain_money+"��");
			remain_money = remain_money-remain_money;
			out.println("��ȯ�Ϸ�");
			out.println("��� ���� �ݾ�:"+remain_money);
		}
	}
	
	@Override
	public void enter_Menu() {
		MachineVO vo = new MachineVO();
		
		out.println("���Ǳ� �޴� ���");
		
		out.println("�޴� �̸� ?");
		
		vo.setDrink_name(sc.next());
		
		out.println("�޴� ���� ?(���ڸ� �Է�)");
		
		vo.setDrink_price(sc.nextInt());
		
		out.println("��� ���(ä�� ����)");
		
		vo.setDrink_stock(sc.nextInt());

		list.add(vo);
		
		out.println("��� �Ϸ�");
	}
	
	@Override
	public void print_Menu() {
		out.println("�޴�");
		
		MachineVO vo = new MachineVO();
		
		Iterator<MachineVO> it = list.iterator();
		while(it.hasNext()) {
			vo = it.next();
			
			out.println("��ǰ��:"+vo.getDrink_name()+"");
			out.println("����:"+vo.getDrink_price()+"");
			out.println("��� ����:"+vo.getDrink_stock()+"");
			
			out.println();
		}
		
		
	}
	
	@Override
	public void choice_Menu() {
		out.println("�޴� ����");
		
		print_Menu();
		
		out.println();
		
		String s;
		MachineVO vo = new MachineVO();
		Iterator<MachineVO> it = list.iterator();
		
		out.println("���ϴ� ��ǰ�� �Է�");
		
		s = sc.next();
		
		while(it.hasNext() ) {
			vo = it.next();
			
			if(s.equals(vo.getDrink_name())) {
				if(vo.getDrink_stock()==0) {
					out.println("��� �����ϴ�.");
					break;
				}
				
				if(remain_money-vo.getDrink_price()<0) {
					out.println("�ܾ��� �����մϴ�.");
					break;
				}
				
				remain_money = remain_money - vo.getDrink_price();
				vo.setDrink_stock(vo.getDrink_stock()-1);
				out.println(vo.getDrink_name()+"��¿Ϸ�,������"+
				remain_money+"���:"+vo.getDrink_stock());
			}
		}
	}
	
	@Override
	public void enter_Stock() {
		out.println("��� ����");
		 String s;
		 int stock;
		 MachineVO vo = new MachineVO();
		 print_Menu();
		 
		 out.println();
		 
		 out.println("������ ���� �� �Է�");
		 
		 s = sc.next();
		 
		Iterator<MachineVO> it = list.iterator();
		
		out.println("������ ��� ���� �Է�");
		
		stock = sc.nextInt();
		
		while(it.hasNext()) {
			vo = it.next();
			
			if(s.equals(vo.getDrink_name())) {
				vo.setDrink_stock(vo.getDrink_stock()+stock);
				out.println(vo.getDrink_name()+"�����Ϸ� ���:"+vo.getDrink_stock());
				break;
			}
		}


	}
	
	
	@Override
	public void delete_Menu() {
		out.println("������ ��ǰ�� �Է�");
		
		String s;
		MachineVO vo = new MachineVO();
		print_Menu();
		
		s = sc.next();
		
		Iterator<MachineVO> it = list.iterator();
		
		while(it.hasNext()) {
			vo =it.next();
			
			if(s.equals(vo.getDrink_name())) {
				list.remove(vo);
				out.println("���� �Ϸ�.");
				break;
			}
		}
	}
	
	@Override
	public void update_Menu() {
		out.println("������ ��ǰ �� �Է�");
		String s;
		MachineVO vo = new MachineVO();
		print_Menu();
		
		s = sc.next();
		
		Iterator<MachineVO> it = list.iterator();
		
		while(it.hasNext()) {
			vo = it.next();
			
			if(s.equals(vo.getDrink_name())) {
				out.println("(����) �޴� �̸� ?");
				vo.setDrink_name(sc.next());
				out.println("(����) �޴� ���� ?(���ڸ� �Է�)");
				vo.setDrink_price(sc.nextInt());
				out.println("(����) ��� �Է�");
				vo.setDrink_stock(sc.nextInt());
				out.println("�����Ϸ�");
				break;				
			}
		}
	}
	
	
	
	
	
	
	
	
}

















