package format;
import javax.xml.transform.Result;

import format.myFormat;
import java.util.Scanner;

public class myFormat {
	/* �׽�Ʈ 20180705  */
	public String stringFormatTest(int intValue){
		String returnString = "";
		Scanner sc = new Scanner(System.in);
		
		switch(intValue) {
			case 1 :
				returnString = "1�� �����ϼ̽��ϴ�.";
				System.out.println("��ġ����) �� �ݾ��� �Է� �� �ּ���.");
				float amount = sc.nextFloat();
				System.out.println("��ġ����) �� ���ΰ���?");
				int ppl = sc.nextInt();
				float douch = douchPayValue(amount,ppl);
				System.out.println("1��� "+douch + "�� ���� �Ͻø� �˴ϴ�.");
				break;
			case 2 :
				returnString = "2�� �����ϼ̽��ϴ�.";
				break;
			case 3 :
				returnString = "3�� �����ϼ̽��ϴ�.";
				break;
			case 4 :
				returnString = "4�� �����ϼ̽��ϴ�.";
				break;
			default :
				returnString = "�⺻�� �����ϼ̽��ϴ�.";
				break;
		}
		return returnString;
	}
	
	/*
	 *  ��ġ�����ϱ�.
	 */
	public float douchPayValue(float amount, int ppl) {
		return  amount / (float) ppl;
	}
}
