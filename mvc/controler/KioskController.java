package mvc.controler;
import java.util.ArrayList;
import java.util.Scanner;

import mvc.view.kioskView;
import mvc.vo.OrderMenuVO;

public class KioskController {
	private static int[] price = {3000,5000,3500,5000,4000};
	
	public static void selectMenuPrint() {
		System.out.println("******************선택 메뉴 종류****************");
		System.out.println("1.떡볶이 \t 2.쫄면 \t 3.순대 \t 4.튀김 \t 5.김밥");
		System.out.println("*******************************************");
	}
	
	public static void main(String args[]) {
		ArrayList<OrderMenuVO> orderMenuArrList = new ArrayList<OrderMenuVO>();
		Scanner s1 = new Scanner(System.in);//문자열 입력용
		Scanner s2 = new Scanner(System.in);//숫자 입력용;
		
		selectMenuPrint();
		int orderNo = 1;
		
		while(true) {
			System.out.print("* 선택한 메뉴의 번호를 입력해주세요 : ");
			int menuNo = s2.nextInt();
			System.out.print("* 선택한 메뉴의 개수를 입력해주세요 : ");
			int menucount = s2.nextInt();
			
			OrderMenuVO om = new OrderMenuVO(orderNo, menuNo, price[menuNo-1], menucount);
			orderMenuArrList.add(om);
			System.out.println("* 메뉴를 계속 선택하시겠습니까?(y/n)");
			String msg = s1.nextLine();
			if(msg.equals("n")||msg.equals("no"))
				break;
			
		}
		//전체 주문 내역 출력
		kioskView view = new kioskView(orderMenuArrList);
		view.print();
		System.out.println();
		
		//결제 및 완료 화면 출력
		System.out.println("*********************************");
		System.out.println(orderNo +" 고객님의 결제 및 주문이 완료되었습니다.");
		System.out.println("*********************************");
		s1.close();
		s2.close();
	}
}
