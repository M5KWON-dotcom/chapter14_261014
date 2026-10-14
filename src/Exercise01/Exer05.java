package Exercise01;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		String str = sc.nextLine();
		try {
			int num = Integer.parseInt(str);
			if(num%2==0) {
				System.out.println("입력하신 숫자는 짝수입니다!");
			}else { 
				System.out.println("입력하신 숫자는 홀수입니다!");
			}
		} catch (NumberFormatException e) {
			System.out.println("정수만 입력 가능합니다!");
			e.printStackTrace();
		}

		sc.close();
		System.out.println("프로그램 정상종료");
	}

}
