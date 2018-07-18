package format;
import javax.xml.transform.Result;

import format.myFormat;
import format.plumCalendar;
import format.plumFormat;

import java.util.Date;
import java.util.Scanner;

public class myFormat {
	/* 테스트 20180705  */
	public String stringFormatTest(int intValue){
		String returnString = "";
		Scanner sc = new Scanner(System.in);
		plumCalendar cal = new plumCalendar();
		plumFormat format = new plumFormat();
		
		switch(intValue) {
			case 1 :
				System.out.println("더치페이) 총 금액을 입력 해 주세요. \n");
				float amount = sc.nextFloat();
				System.out.println("더치페이) 몇 명인가요?  \n");
				int ppl = sc.nextInt();
				float douch = format.douchPayValue(amount,ppl);
				//round value
				douch = format.roundMath(douch);
				System.out.println("1명당 "+douch + "원 결제 하시면 됩니다.  \n");
				returnString = "1번 선택하셨습니다. \n";
				break;
			case 2 :
				System.out.println("시간구하기) 현재 시각을 가져옵니다. \n");
				System.out.println("현재 시각.. "+ cal.getToday());
				System.out.println("시스템의 밀리초 구하기. 									"+ cal.getMiliSeconds()+"\n");
				System.out.println("경과시간(초) 구하기. 									"+ cal.getAfterMiliSeconds(cal.getMiliSeconds())+"\n");
				System.out.println("Date를 Calendar로 맵핑하기								"+"\n");
				cal.returnCalendar();
				System.out.println("날짜(년/월/일/시/분/초) 구하기								"+ cal.simpleFormatDate()+"\n");
				System.out.println("날짜(년/월/일/시/분/초) 구하기	2							");
				System.out.println(">>>>>>>												");	cal.simpleGregorianFormatDate();
				System.out.println(">>>>>>>												");
				System.out.println("날짜(년/월/일/시/분/초) 구하기	3							"+ cal.getDateInstance()+"\n");
				System.out.println("표준시간대를 지정하고 날짜를 가져오기							"+ cal.getTimeZone("JST")+"\n");
				System.out.println("영어로된 날짜를 숫자로 바꾸기								"+ cal.getStdDateToFormattedDate(cal.getToday())+"\n");
				System.out.println("\"Sun, 5 Dec 1999 00:07:21\"를 \"1999-12-05\"로 바꾸기   "+ cal.getStdDateToFormattedDate2(cal.getToday())+"\n");
				System.out.println("숫자 12자리를 다시 날짜로 변환하기						    "+ cal.getNumberToDate()+"\n");
				
				returnString = "2번 선택하셨습니다. \n";
				break;
			case 3 :
				returnString = "3번 선택하셨습니다. \n";
				break;
			case 4 :
				returnString = "4번 선택하셨습니다. \n";
				break;
			case 0 :
			case 5 :
			case 6 :
			case 7 :
			case 8 :
			case 9 :
				returnString = "";
			default :
				returnString = "";
				break;
		}
		return returnString;
	}
	

	
}
