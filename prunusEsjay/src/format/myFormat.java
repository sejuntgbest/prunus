package format;
import javax.xml.transform.Result;

import format.myFormat;
import format.plumCalendar;

import java.util.Date;
import java.util.Scanner;

public class myFormat {
	/* �׽�Ʈ 20180705  */
	public String stringFormatTest(int intValue){
		String returnString = "";
		Scanner sc = new Scanner(System.in);
		plumCalendar cal = new plumCalendar();
		
		switch(intValue) {
			case 1 :
				System.out.println("��ġ����) �� �ݾ��� �Է� �� �ּ���. \n");
				float amount = sc.nextFloat();
				System.out.println("��ġ����) �� ���ΰ���?  \n");
				int ppl = sc.nextInt();
				float douch = douchPayValue(amount,ppl);
				//round value
				douch = roundMath(douch);
				System.out.println("1��� "+douch + "�� ���� �Ͻø� �˴ϴ�.  \n");
				returnString = "1�� �����ϼ̽��ϴ�. \n";
				break;
			case 2 :
				System.out.println("�ð����ϱ�) ���� �ð��� �����ɴϴ�. \n");
				System.out.println("���� �ð�.. "+ cal.getToday());
				System.out.println("�ý����� �и��� ���ϱ�. "+ cal.getMiliSeconds()+"\n");
				System.out.println("����ð�(��) ���ϱ�. "+ cal.getAfterMiliSeconds(cal.getMiliSeconds())+"\n");
				returnString = "2�� �����ϼ̽��ϴ�. \n";
				break;
			case 3 :
				returnString = "3�� �����ϼ̽��ϴ�. \n";
				break;
			case 4 :
				returnString = "4�� �����ϼ̽��ϴ�. \n";
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
	
	/**
	 *  ��ġ�����ϱ�.
	 *  @author SJ
	 *  @param amount , ppl
	 *  @return 1�δ� ���� �� �ݾ�
	 */
	public float douchPayValue(float amount, int ppl) {
		return  amount / (float) ppl;
	}
	
	/**
	 * �ݿø��մϴ�.
	 * @author SJ
	 * @param rndValue
	 * @return �ݿø��ϱ�
	 */
	public float roundMath(float rndValue) {
		return Math.round(rndValue);
	}
	
}
