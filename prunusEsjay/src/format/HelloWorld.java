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
		myFormat CHECKS = new myFormat();
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		System.out.println("1: 더치페이 계산기 , 2: 3: 4: 5:");
		int code = sc.nextInt();
		String stringValue = CHECKS.stringFormatTest(code);		
		System.out.println("결과입니다. \n "+stringValue);
	}
}
