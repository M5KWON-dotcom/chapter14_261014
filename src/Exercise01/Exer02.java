package Exercise01;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
	
				System.out.println("정수를 입력하세요.");
				Scanner sc = new Scanner(System.in);
				
				try {
					int number = Integer.parseInt(sc.nextLine());
					if((number>=0)&&(number<=100)) {
						System.out.println("정상적인 숫자입니다.");
					}
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					System.out.println("점수 확인이 완료되었습니다.");
				}
	}

}
