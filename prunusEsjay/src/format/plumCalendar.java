package format;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

//**************************************************************************************************************************************************************//
//**************************************************************************************************************************************************************//
//******************************************************* ��ó : http://betatester.tistory.com/16 ***************************************************************//
//**************************************************************************************************************************************************************//
//**************************************************************************************************************************************************************//
/*******************************************************************LIST OF CALENDAR METHODS*********************************************************************/
/* 01. getToday 					����ð��� ��������			 												@return long Type								    */
/* 02. getMiliSeconds 				�ý����� �и��� ���ϱ�.(����ǥ�ؽð�(UTC, GMT) 1970/1/1/0/0/0 ���κ��� ����� �ð�) 		@return long Type  									*/
/* 03. getAfterMiliSeconds  		����ð�(��) ���ϱ�.(����ǥ�ؽð�(UTC, GMT) 1970/1/1/0/0/0 ���κ��� ����� �ð�) 		@return long Type 			@param long type		*/
/* 04. returnCalendar 				Date�� Calendar�� �����ϱ�																	 									*/
/* 05. simpleFormatDate				��¥(��/��/��/��/��/��) ���ϱ�																										*/
/* 06. simpleGregorianFormatDate 	��¥(��/��/��/��/��/��) ���ϱ�2 																									*/
/* 07. getDateInstance 				��¥(��/��/��/��/��/��) ���ϱ�3 																									*/
/* 08. getTimeZone					ǥ�ؽð��븦 �����ϰ� ��¥�� �������� 												@return String Type			@param  String type		*/
/* 09. getStdDateToFormattedDate	����ε� ��¥�� ���ڷ� �ٲٱ� 													@return String Type			@param  Date type		*/
/* 10. getStdDateToFormattedDate2	"Sun, 5 Dec 1999 00:07:21"�� "1999-12-05"�� �ٲٱ�							@return String Type			@param  Date type		*/
/* 11. dayOfWeek2					����ε� ��¥�� ���ڷ� �ٲٱ� 													@return String Type			@param  Date type		*/
/* 12. getDate 						Ư���Ͽ��� ���� �Ⱓ���� ��¥ ���ϱ� 												@return String Type			@param  Date type		*/
/* 13. getDiffMonth 				���糯¥���� 2������ ��¥�� ���ϱ� 												@return String Type			@param  Date type		*/
/* 14. getLastMonth 				�޿� ������ ��¥�� ���ϱ� 														@return String Type			@param  Date type		*/
/* 15. getLastMonth2				Ư������ �Է¹޾� �ش� ���� ������ ��¥�� ���ϱ� 										@return String Type			@param  Date type		*/
/* 16. maxDays 						�ش���� ���� ��¥�� ���ϱ� 														@return String Type			@param  Date type		*/
/* 17. getStdDateToFormattedDate	����ε� ��¥�� ���ڷ� �ٲٱ� 													@return String Type			@param  Date type		*/
/* 18. getTomorrow 					���� ��¥ ���ϱ�																@return String Type			@param  Date type		*/
/* 19. getTomorrow2 				���� ��¥ ���ϱ�2															@return String Type			@param  Date type		*/
/* 20. getSpecificDate 				5�� ���� ��¥ ���ϱ�															@return String Type			@param  Date type		*/
/* 21. getWhatDayToday 				��¥�� �ش��ϴ� ���� ���ϱ� 														@return String Type			@param  Date type		*/
/* 22. getDiffDays 					�� ��¥�� ���̸� �ϼ��� ���ϱ�2 													@return String Type			@param  Date type		*/
/* 23. GetDifferenceOfDate 			�� ��¥�� ���̸� �ϼ��� ���ϱ�2 													@return String Type			@param  Date type		*/
/* 24. getDateInfoFromFile 			���Ͽ��� ��¥������ �������� 													@return String Type			@param  Date type		*/
/* 25. getPrintDatesForOneYear 		��¥�������� 2000-01-03���� ó���� �ν��� ��Ų�� 7�Ͼ� �����ؼ� 1�������� ��¥�� ���			@return String Type			@param  Date type		*/
/* 26. getDateAnswer 				���ó�¥���ϱ� ���� �ٲٱ�	 													@return String Type			@param  Date type		*/
/* 27. DateCheck 					��¥���ռ�����üũ		 													@return String Type			@param  Date type		*/
/****************************************************************************************************************************************************************/

public class plumCalendar {

	/**
	 * 01. ���� �ð��� ��������.
	 * @return Sat Jul 12 16:03:00 GMT+01:00 2000
	 **/
	
	public Date getToday() {
		Date today = new Date ();
		return today;
	}

	/**
	 * 02. �ý����� �и��� ���ϱ�.(����ǥ�ؽð�(UTC, GMT) 1970/1/1/0/0/0 ���κ��� ����� �ð�)
	 * @return 1531719629364
	 **/
	
	public long getMiliSeconds() {
		// �и��� ����(*1000�� 1��), �����̸� ���� �ð�
		long time = System.currentTimeMillis();
		return time;
	}

	/**
	 * 03. ����ð�(��) ���ϱ�.(����ǥ�ؽð�(UTC, GMT) 1970/1/1/0/0/0 ���κ��� ����� �ð�)
	 * @return 1531719629364
	 **/
	
	public long getAfterMiliSeconds(long time) {
		// �и��� ����(*1000�� 1��), �����̸� ���� �ð�
		long time1 = time - 10000;//System.currentTimeMillis();
		long time2 = System.currentTimeMillis();
		System.out.println("���ϱ� TIME 1 : "+time1+"");
		System.out.println("���ϱ� TIME 2 : "+time2+"\n");
		return (long) (( time2 - time1 ) / 1000.0);
	}
	
	/**
	 * 04. Date�� Calendar�� �����ϱ�
	 * @return 
	 * */
	public void returnCalendar() {
		Date d = new Date ( );
		Calendar c = Calendar.getInstance ( );
		c.setTime ( d );
	}
	
	/**
	 * 05. ��¥(��/��/��/��/��/��) ���ϱ�
	 * @return
	 */
	public String simpleFormatDate()
	{
		SimpleDateFormat formatter = new SimpleDateFormat ( "yyyy.MM.dd HH:mm:ss", Locale.KOREA );
		Date currentTime = new Date ( );
		String dTime = formatter.format ( currentTime );
		//System.out.println ( dTime );
		return dTime;
	}
	
	/**
	 * 06. ��¥(��/��/��/��/��/��) ���ϱ�2
	 */
	public void simpleGregorianFormatDate()
	{
		GregorianCalendar today = new GregorianCalendar ( );
		 
		int year = today.get ( today.YEAR );
		int month = today.get ( today.MONTH ) + 1;
		int yoil = today.get ( today.DAY_OF_MONTH );
		 
		 
		GregorianCalendar gc = new GregorianCalendar ( );
		 
		 
		System.out.println ( gc.get ( Calendar.YEAR ) );
		System.out.println ( String.valueOf ( gc.get ( Calendar.MONTH ) + 1 ) );
		System.out.println ( gc.get ( Calendar.DATE ) );
		System.out.println ( gc.get ( Calendar.DAY_OF_MONTH ) );
	}
	
	/***
	 * 07. ��¥(��/��/��/��/��/��) ���ϱ�3
	 * @return
	 */
	public String getDateInstance() {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
		Calendar cal = Calendar.getInstance(Locale.KOREA);
		String nbl = df.format(cal.getTime());
		return nbl;
	}

	
	/***
	 * 08. ǥ�ؽð��븦 �����ϰ� ��¥�� ��������
	 * ��� : 2000�� 8�� 5�� 16�� 16�� 47��
	 * @param String
	 * @return String
	 */
	public String getTimeZone(String zone) {
		TimeZone jst = TimeZone.getTimeZone (zone);
		Calendar cal = Calendar.getInstance ( jst ); // �־��� �ð��뿡 �°� ���� �ð����� �ʱ�ȭ�� GregorianCalender ��ü�� ��ȯ.// �Ǵ� Calendar now = Calendar.getInstance(Locale.KOREA);
		System.out.println ( cal.get ( Calendar.YEAR ) + "�� " + ( cal.get ( Calendar.MONTH ) + 1 ) + "�� " + cal.get ( Calendar.DATE ) + "�� " + cal.get ( Calendar.HOUR_OF_DAY ) + "�� " +cal.get ( Calendar.MINUTE ) + "�� " + cal.get ( Calendar.SECOND ) + "�� " );
		return cal.get ( Calendar.YEAR ) + "�� " + ( cal.get ( Calendar.MONTH ) + 1 ) + "�� " + cal.get ( Calendar.DATE ) + "�� " + cal.get ( Calendar.HOUR_OF_DAY ) + "�� " +cal.get ( Calendar.MINUTE ) + "�� " + cal.get ( Calendar.SECOND ) + "�� " ;
	}

	
	/***
	 * 09. ����ε� ��¥�� ���ڷ� �ٲٱ�
	 * ��� : 2000�� 8�� 5�� 16�� 16�� 47��
	 * @param  Date
	 * @return String
	 */
	public String getStdDateToFormattedDate(Date inDate) {
		
		Date myDate = new Date ( "Sun,5 Dec 1999 00:07:21" ); 
		System.out.println ( myDate.getYear ( ) + "-" + myDate.getMonth ( ) + "-" + myDate.getDay ( ) );
		return myDate.getYear ( ) + "-" + myDate.getMonth ( ) + "-" + myDate.getDay ( );
	}

	
	/***
	 * 10. "Sun, 5 Dec 1999 00:07:21"�� "1999-12-05"�� �ٲٱ�
	 * ��� : 2000�� 8�� 5�� 16�� 16�� 47��
	 * @param  Date
	 * @return String
	 */
	public String getStdDateToFormattedDate2(Date inDate) {
		
		SimpleDateFormat formatter_one = new SimpleDateFormat ( "EEE, dd MMM yyyy hh:mm:ss",Locale.ENGLISH );
		SimpleDateFormat formatter_two = new SimpleDateFormat ( "yyyy-MM-dd" );		 
		 
		String inString = "Sun, 5 Dec 1999 00:07:21";
		 
		ParsePosition pos = new ParsePosition ( 0 );
		Date frmTime = formatter_one.parse ( inString, pos );
		String outString = formatter_two.format ( frmTime );
		 		 
		System.out.println ( outString );
		return outString;
	}
	
	/***
	 * 11. ���� 12�ڸ���, �ٽ� ��¥�� ��ȯ�ϱ�
	 * ��� : 2000�� 8�� 5�� 16�� 16�� 47��
	 * @param  Date
	 * @return String
	 */
	public String getNumberToDate() {
	
		Date conFromDate = new Date();
		long ttl = Date.parse ( "Dec 25, 1997 10:10:10" );
		System.out.println ( ttl ); //�� 938291839221
		 
		Date today = new Date ( ttl );
		DateFormat format = DateFormat.getDateInstance ( DateFormat.FULL,Locale.US );
		String formatted = format.format ( today );
		System.out.println ( formatted );
		return formatted;
	}

	/***
	 * 12. getDate Ư���Ͽ��� ���� �Ⱓ���� ��¥ ���ϱ�
	 * ��� : 2000�� 8�� 5�� 16�� 16�� 47��
	 * @param  Date
	 * @return String
	 */
	public String getDate ( int iDay )
	{
		Calendar temp=Calendar.getInstance ( );
		StringBuffer sbDate=new StringBuffer ( );
		 
		 
		temp.add ( Calendar.DAY_OF_MONTH, iDay );
		 
		 
		int nYear = temp.get ( Calendar.YEAR );
		int nMonth = temp.get ( Calendar.MONTH ) + 1;
		int nDay = temp.get ( Calendar.DAY_OF_MONTH );
		 
		 
		sbDate.append ( nYear );
		if ( nMonth < 10 )
		sbDate.append ( "0" );
		sbDate.append ( nMonth );
		if ( nDay < 10 )
		sbDate.append ( "0" );
		sbDate.append ( nDay );
		 
		 
		return sbDate.toString ( );
	}
	
	/***
	 * 13. getDiffMonth ���糯¥���� 2������ ��¥�� ���ϱ�
	 * ��� : 2000�� 8�� 5�� 16�� 16�� 47��
	 * @param  Date
	 * @return String
	 */
	public String getDiffMonth()
	{
		Calendar cal = Calendar.getInstance ( );//���� ��¥�� ��������..
		cal.add ( cal.MONTH, -2 ); //2���� ��....
		System.out.println ( cal.get ( cal.YEAR ) );
		System.out.println ( cal.get ( cal.MONTH ) + 1 );
		System.out.println ( cal.get ( cal.DATE ) );
		
		return cal.get ( cal.YEAR ) + ""  + cal.get ( cal.MONTH ) + 1 + "" +  cal.get ( cal.DATE );
	}
	
	/***
	 * 14. getLastMonth �޿� ������ ��¥�� ���ϱ�
	 * ��� : 2000�� 8�� 5�� 16�� 16�� 47��
	 * @param  Date
	 * @return String
	 */
	public String getLastMonth(int month)
	{
		GregorianCalendar cld = new GregorianCalendar ( 2001, month - 1, 1 );
		//System.out.println ( month + "/" + cld.getActualMaximum ( Calendar.DAY_OF_MONTH ) );
		return month + "/" + cld.getActualMaximum ( Calendar.DAY_OF_MONTH );
	}
	
	/***
	 * 15. getLastMonth2 Ư������ �Է¹޾� �ش� ���� ������ ��¥�� ���ϴ� ������ ����.(���� -1 ���ش�.)...���� 30�� 31�� �˾ƿ���.
	 * ��� :
	 * @param  Date
	 * @return String
	 */
	public String getLastMonth2(String dates)
	{
		Calendar cal = Calendar.getInstance ( );
		String[] args = dates.split(".");
		cal.set ( Integer.parseInt ( args[0] ), Integer.parseInt ( args [1] ) - 1, Integer.parseInt ( args [2] ) );
		SimpleDateFormat dFormat = new SimpleDateFormat ( "yyyy-MM-dd" );
		System.out.println ( "�Է� ��¥ " + dFormat.format ( cal.getTime ( ) ) );
		System.out.println ( "�ش� ���� ������ ���� : " + cal.getActualMaximum ( Calendar.DATE ) );
		return dFormat.format ( cal.getTime ( ) ) +  "�ش� ���� ������ ���� : " + cal.getActualMaximum ( Calendar.DATE ) ;
	}
	
	/***
	 * 16. maxDays �ش���� ���� ��¥�� ���ϱ� ( 1999�� 1������ ���� ��¥���� ���ϱ� )
	 * ��� :
	 * @param  Date
	 * @return String
	 */
	public int maxDays()
	{
		Calendar calendar = Calendar.getInstance ( );
		calendar.set ( 1999, 0, 1 );
		int maxDays = calendar.getActualMaximum ( Calendar.DAY_OF_MONTH );
		
		return maxDays;
	}
	

	/***
	 * 17. getYesterday ���� ��¥ ���ϱ�
	 * setTime((�����Ϻ��� ���ñ����� �ʸ� ����) - 24*60*60)
	 * @param  Date
	 * @return String
	 */
	public static Date getYesterday ( Date today )
	{
		if ( today == null )
		throw new IllegalStateException ( "today is null" );
		Date yesterday = new Date ( );
		yesterday.setTime ( today.getTime ( ) - ( (long) 1000 * 60 * 60 * 24 ) );
		 
		 
		return yesterday;
	}
	
	/***
	 * 18. getTomorrow ���� ��¥ ���ϱ�
	 * ��� :
	 * @param  Date
	 * @return String
	 */
	public static Date getTomorrow ()
	{
		Date today = new Date ();
		Date tomorrow = new Date ( today.getTime ( ) + (long) ( 1000 * 60 * 60 * 24 ) );
		
		return tomorrow;
	}
	
	/***
	 * 19. getTomorrow2 ���� ��¥ ���ϱ�2
	 * ��� :
	 * @param  Date
	 * @return String
	 */
	public static Date getTomorrow2 ()
	{
		Calendar today = Calendar.getInstance ( );
		today.add ( Calendar.DATE, 1 );
		Date tomorrow = today.getTime ( );
		
		return tomorrow;
	}
	
	/***
	 * 20. getSpecificDate 5�� ���� ��¥ ���ϱ�
	 * ��� :
	 * @param  Date
	 * @return String
	 */
	public void getSpecificDate ()
	{
		Calendar cCal = Calendar.getInstance();
		cCal.add(Calendar.DATE, 5);
		
	}
	
	/***
	 * 21. getWhatDayToday ��¥�� �ش��ϴ� ���� ���ϱ�
	 * ��� :
	 * @param  Date
	 * @return String
	 */
	public String getWhatDayToday ()
	{
		//DAY_OF_WEEK���ϰ��� �Ͽ���(1), ������(2), ȭ����(3) ~~ �����(7)�� ��ȯ�մϴ�.
		//�Ʒ� �ҽ��� JSP�Ϻ��Դϴ�.		 
		Calendar cal= Calendar.getInstance ( );
		int day_of_week = cal.get ( Calendar.DAY_OF_WEEK );
		String m_week="";
		if ( day_of_week == 1 )
		m_week="�Ͽ���";
		else if ( day_of_week == 2 )
		m_week="������";
		else if ( day_of_week == 3 )
		m_week="ȭ����";
		else if ( day_of_week == 4 )
		m_week="������";
		else if ( day_of_week == 5 )
		m_week="�����";
		else if ( day_of_week == 6 )
		m_week="�ݿ���";
		else if ( day_of_week == 7 )
		m_week="�����";	
		
		return m_week;
	}
	
	/***
	 * 21. getEngDays ��¥�� �ش��ϴ� ���� ���ϱ�
	 * ��� :
	 * @param  Date
	 * @return String
	 */
	public String getEngDays()
	{
		//gc.get(gc.DAY_OF_WEEK); �ϸ� �Ͽ���=1, ������=2, ..., �����=7�� �����ϱ�,
		//������ �迭�� ���� �̾Ƴ��� �ǰ���.
		GregorianCalendar gc=new GregorianCalendar ( 2000, 10 - 1 , 23 );
		String [] dayOfWeek = { "", "Sun", "Mon", "Tue", "Wed" , "Thu" , "Fri" , "Sat" };
		String yo_il = dayOfWeek2(gc.get(gc.DAY_OF_WEEK));		
		//return m_week;
		return yo_il;
	}


	private String dayOfWeek2(int i) {
		Calendar c = Calendar.getInstance();
 		String week = String.valueOf(c.get(Calendar.WEEK_OF_MONTH));
 		return week;
	}

	/***
	 * 22. getDiffDays �� ��¥�� ���̸� �ϼ��� ���ϱ�2
	 * ��� :
	 * @param  Date
	 * @return String
	 */
	public void getDiffDays()
	{
		Date today = new Date ( );
		Calendar cal = Calendar.getInstance ( );
		cal.setTime ( today );// ���÷� ����.
		 
		 
		Calendar cal2 = Calendar.getInstance ( );
		cal2.set ( 2000, 3, 12 ); // �����Ϸ� ����. month�� ��� �ش����-1�� ���ݴϴ�.
		 
		 
		int count = 0;
		while ( !cal2.after ( cal ) )
		{
			count++;
			cal2.add ( Calendar.DATE, 1 ); // �������� �ٲ�
			 
			 
			System.out.println ( cal2.get ( Calendar.YEAR ) + "�� " + ( cal2.get ( Calendar.MONTH ) + 1 ) + "�� " + cal2.get ( Calendar.DATE ) + "��" );
		}
		 
		System.out.println ( "�����Ϸκ��� " + count + "���� �������ϴ�." );
	}

	/***
	 * 23. GetDifferenceOfDate �� ��¥�� ���̸� �ϼ��� ���ϱ�2
	 * ��� :
	 * @param  Date
	 * @return String
	 */
	public static int GetDifferenceOfDate ( int nYear1, int nMonth1, int nDate1, int nYear2, int nMonth2, int nDate2 )
	{
		Calendar cal = Calendar.getInstance ( );
		int nTotalDate1 = 0, nTotalDate2 = 0, nDiffOfYear = 0, nDiffOfDay = 0;
	 
	 
		if ( nYear1 > nYear2 )
		{
			for ( int i = nYear2; i < nYear1; i++ )
			{
				cal.set ( i, 12, 0 );
				nDiffOfYear += cal.get ( Calendar.DAY_OF_YEAR );
			}
			nTotalDate1 += nDiffOfYear;
		}
		else if ( nYear1 < nYear2 )
		{
			for ( int i = nYear1; i < nYear2; i++ )
			{
				cal.set ( i, 12, 0 );
				nDiffOfYear += cal.get ( Calendar.DAY_OF_YEAR );
			}
			nTotalDate2 += nDiffOfYear;
		}
	 
	 
		cal.set ( nYear1, nMonth1-1, nDate1 );
		nDiffOfDay = cal.get ( Calendar.DAY_OF_YEAR );
		nTotalDate1 += nDiffOfDay;
		 
		 
		cal.set ( nYear2, nMonth2-1, nDate2 );
		nDiffOfDay = cal.get ( Calendar.DAY_OF_YEAR );
		nTotalDate2 += nDiffOfDay;
		 
		 
		return nTotalDate1-nTotalDate2;
	}
	 
	/***
	 * 24. getDateInfoFromFile ���Ͽ��� ��¥������ ��������
	 * ��� :
	 * @param  Date
	 * @return String
	 */
	public void getDateInfoFromFile(String directory, String file)
	{
		File f = new File ( directory, file );
		 
		 
		Date date = new Date ( f.lastModified ( ) );
		Calendar cal = Calendar.getInstance ( );
		cal.setTime ( date );
		 
		 
		System.out.println("Year : " + cal.get(Calendar.YEAR));
		System.out.println("Month : " + (cal.get(Calendar.MONTH) + 1));
		System.out.println("Day : " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("Hours : " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minutes : " + cal.get(Calendar.MINUTE));
		System.out.println("Second : " + cal.get(Calendar.SECOND));

	}
	
	/***
	 * 25. getPrintDatesForOneYear ��¥�������� 2000-01-03���� ó���� �ν��� ��Ų�� 7�Ͼ� �����ؼ� 1�������� ��¥�� ���
	 * ��� :
	 * @param  Date
	 * @return String
	 */
	public void getPrintDatesForOneYear()
	{
		SimpleDateFormat sdf = new SimpleDateFormat ( "yyyy-mm-dd" );
		Calendar c = Calendar.getInstance ( );
		 
		for ( int i = 0; i < 48; i++ )
		{
			c.clear ( );
			c.set ( 2000, 1, 3 - ( i * 7 ) );
			java.util.Date d = c.getTime ( );
			String thedate = sdf.format ( d );
			System.out.println ( thedate );
		} 
	}
	
	/**
	 * ���� : �����忡�� ��¥ �ٲٸ� �״� ���� Mainȭ�鿡 ��¥�ͽð���Display�Ǵ� JPanel�� �ֽ��ϴ�. 
	 * date�� ��¥�� �ð��� �����ϸ� Mainȭ���� ��¥�� �ð��� Display�Ǵ� Panel�� ����� ��¥�� Display���� �ʰ� Mainȭ���� ����Ǿ� �����ϴ�. 
	 * �����ҽ�:
	 * public void run ( )
		{
		while ( true )
		{
		try{
		timer.sleep ( 60000 );
		}
		catch ( InterruptedException ex ) { }
		 
		 
		lblTimeDate.setText ( fGetDateTime ( ) );
		repaint ( );
		}
		}
		 
		 
		public String fGetDateTime ( )
		{
		final int millisPerHour = 60 * 60 * 1000;
		String DATE_FORMAT = "yyyy / MM / dd HH:mm";
		SimpleDateFormat sdf = new SimpleDateFormat ( DATE_FORMAT );
		SimpleTimeZone timeZone = new SimpleTimeZone ( 9 * millisPerHour, "KST" );
		sdf.setTimeZone ( timeZone );
		 
		 
		long time = System.currentTimeMillis ( );
		Date date = new Date ( time );
		return sdf.format ( date );
		}
	 */

	/***
	 * 26. getDateAnswer ���ó�¥���ϱ� ���� �ٲٱ�
	 * ��� :
	 * @param  Date
	 * @return String
	 */
	public String getDateAnswer ( )
	{
		// ��¥�� ���� ���Ѵ�. timezone ���� ��¥�� �ٽ� �����Ͻø� �ʴϴ�.
		Date now = new Date ( );
		SimpleDateFormat sdf4 = new SimpleDateFormat ( "yyyy/MM/dd HH:mm EE" );
		sdf4.setTimeZone ( TimeZone.getTimeZone ( "Asia/Seoul" ) );
		 
		return sdf4.format ( now );
	}
	

	/***
	 * 27. DateCheck ��¥���ռ�����üũ
	 * ��� :
	 * @param  Date
	 * @return String
	 */
	public class DateCheck
	{
		boolean dateValidity = true;
		 
		 
		DateCheck ( String dt )
		{
			try
			{
			DateFormat df = DateFormat.getDateInstance ( DateFormat.SHORT );
			df.setLenient ( false );
			Date dt2 = df.parse ( dt );
			}
			catch ( ParseException e ) { this.dateValidity = false; }
			catch ( IllegalArgumentException e ) { this.dateValidity = false; }
		}
		 
		 
		public boolean datevalid ( )
		{
			return dateValidity;
		}

	}
	
}


