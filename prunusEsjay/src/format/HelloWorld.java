package format;
import java.math.BigDecimal;
import format.myFormat;
import java.util.Scanner;  

public class HelloWorld {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		/**
		 * @param args
		 */
		System.out.println("The beginning of the Program!");

		BigDecimal mbr_mlg = new BigDecimal(12222);
		BigDecimal multiply_ten = new BigDecimal(10);
		//mbr_mlg = 3;	//현재회원 마일리지 갖고옴
		mbr_mlg = mbr_mlg.divide(multiply_ten, 0, BigDecimal.ROUND_DOWN);
		mbr_mlg = mbr_mlg.multiply(multiply_ten);
		System.out.println("주문시 마일리지 사용금액 보여줄때, [" + mbr_mlg + " 원]");
		
		myFormat CHECKS = new myFormat();
		
		String test = CHECKS.Test();
		
		System.out.println("테스트 나옴 ?"+test);
		
		Scanner sc=new Scanner(System.in);  
	     
	   System.out.println("Enter your rollno");  
	   int rollno=sc.nextInt();  
	   System.out.println("Enter your name");  
	   String name=sc.next();  
	   System.out.println("Enter your fee");  
	   double fee=sc.nextDouble();  
	   System.out.println("Rollno:"+rollno+" name:"+name+" fee:"+fee);  
	   sc.close();  
	   
	   String input = "10 tea 20 coffee 30 tea buiscuits";  
	     Scanner s = new Scanner(input).useDelimiter("\\s");  
	     System.out.println(s.nextInt());  
	     System.out.println(s.next());  
	     System.out.println(s.nextInt());  
	     System.out.println(s.next());  
	     s.close();   
	}
}
