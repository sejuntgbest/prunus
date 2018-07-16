package format;
import java.math.BigDecimal;
import format.myFormat;
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		/**
		 * @param args
		 * 헬로월드 시작 3일차
		 */		
		
		guideSelection();
	}
	/**
	 * 
	 * 선택안내
	 * 
	 * */
	public static void guideSelection() {
		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력하세요.");
		System.out.println("1: 더치페이 계산기 , 2: 지금 시각은? 3: , 4: , 5: , 0: quit ");
		int code = sc.nextInt();
		yourSelection(code);
	}
	
	/**
	 * 코드별 선택결과
	 * @param code
	 */
	public static void yourSelection(int code) {
		myFormat CHECKS = new myFormat();
		String stringValue = CHECKS.stringFormatTest(code);		
		System.out.println("결과입니다. \n "+stringValue);
		if("".equals(stringValue)) {
			System.out.println("종료!!!");
			
		}
		else {
			guideSelection();
		}
	}
}
