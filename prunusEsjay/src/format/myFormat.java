package format;
import javax.xml.transform.Result;

import format.myFormat;
import java.util.Scanner;

public class myFormat {
	/* 테스트 20180705  */
	public String stringFormatTest(int intValue){
		String returnString = "";
		Scanner sc = new Scanner(System.in);
		
		switch(intValue) {
			case 1 :
				returnString = "1번 선택하셨습니다.";
				System.out.println("더치페이) 총 금액을 입력 해 주세요.");
				float amount = sc.nextFloat();
				System.out.println("더치페이) 몇 명인가요?");
				int ppl = sc.nextInt();
				float douch = douchPayValue(amount,ppl);
				System.out.println("1명당 "+douch + "원 결제 하시면 됩니다.");
				break;
			case 2 :
				returnString = "2번 선택하셨습니다.";
				break;
			case 3 :
				returnString = "3번 선택하셨습니다.";
				break;
			case 4 :
				returnString = "4번 선택하셨습니다.";
				break;
			default :
				returnString = "기본값 선택하셨습니다.";
				break;
		}
		return returnString;
	}
	
	/*
	 *  더치페이하기.
	 */
	public float douchPayValue(float amount, int ppl) {
		return  amount / (float) ppl;
	}
}
