package format;
import java.math.BigDecimal;
import format.myFormat;


public class HelloWorld {
	public static void main(String[] args) {
		/**
		 * @param args
		 */
		System.out.println("The beginning of the Program!");
		/*
		System.out.println("Hellow World");
		System.out.println("1           ");
		System.out.println("2");
		System.out.println("3");*/
		BigDecimal mbr_mlg = new BigDecimal(12222);
		BigDecimal multiply_ten = new BigDecimal(10);
		//mbr_mlg = 3;	//현재회원 마일리지 갖고옴
		mbr_mlg = mbr_mlg.divide(multiply_ten, 0, BigDecimal.ROUND_DOWN);
		mbr_mlg = mbr_mlg.multiply(multiply_ten);
		System.out.println("주문시 마일리지 사용금액 보여줄때, [" + mbr_mlg + " 원]");
		
		myFormat CHECKS = new myFormat();
		
		String test = CHECKS.Test();
		
		System.out.println("테스트 나옴 ?"+test);
	}
}
