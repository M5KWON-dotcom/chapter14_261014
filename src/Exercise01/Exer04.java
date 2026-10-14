package Exercise01;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner sc;
		int num1=0;
		int num2=1;
		try {
			sc = new Scanner(System.in);
			System.out.println("첫번째 숫자를 입력하세요: ");
			num1 = sc.nextInt();
			System.out.println("두번째 숫자를 입력하세요: ");
			num2 = sc.nextInt();
			System.out.println("당신이 입력한 두 숫자의 합: "+ (num1+num2));
			sc.close();  //sc 객체 닫기, scanner 사용종료
		} catch (Exception e) {
			System.out.println("정수 숫자만 입력 가능합니다. 다시 확인하세요: ");
			e.printStackTrace();
		}
		
	    }

}
