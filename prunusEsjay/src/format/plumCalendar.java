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
//******************************************************* 출처 : http://betatester.tistory.com/16 ***************************************************************//
//**************************************************************************************************************************************************************//
//**************************************************************************************************************************************************************//
/*******************************************************************LIST OF CALENDAR METHODS*********************************************************************/
/* 01. getToday 					현재시각을 가져오기			 												@return long Type								    */
/* 02. getMiliSeconds 				시스템의 밀리초 구하기.(국제표준시각(UTC, GMT) 1970/1/1/0/0/0 으로부터 경과한 시각) 		@return long Type  									*/
/* 03. getAfterMiliSeconds  		경과시간(초) 구하기.(국제표준시각(UTC, GMT) 1970/1/1/0/0/0 으로부터 경과한 시각) 		@return long Type 			@param long type		*/
/* 04. returnCalendar 				Date를 Calendar로 맵핑하기																	 									*/
/* 05. simpleFormatDate				날짜(년/월/일/시/분/초) 구하기																										*/
/* 06. simpleGregorianFormatDate 	날짜(년/월/일/시/분/초) 구하기2 																									*/
/* 07. getDateInstance 				날짜(년/월/일/시/분/초) 구하기3 																									*/
/* 08. getTimeZone					표준시간대를 지정하고 날짜를 가져오기 												@return String Type			@param  String type		*/
/* 09. getStdDateToFormattedDate	영어로된 날짜를 숫자로 바꾸기 													@return String Type			@param  Date type		*/
/* 10. getStdDateToFormattedDate2	"Sun, 5 Dec 1999 00:07:21"를 "1999-12-05"로 바꾸기							@return String Type			@param  Date type		*/
/* 11. dayOfWeek2					영어로된 날짜를 숫자로 바꾸기 													@return String Type			@param  Date type		*/
/* 12. getDate 						특정일에서 일정 기간후의 날짜 구하기 												@return String Type			@param  Date type		*/
/* 13. getDiffMonth 				현재날짜에서 2달전의 날짜를 구하기 												@return String Type			@param  Date type		*/
/* 14. getLastMonth 				달에 마지막 날짜를 구하기 														@return String Type			@param  Date type		*/
/* 15. getLastMonth2				특정일을 입력받아 해당 월의 마지막 날짜를 구하기 										@return String Type			@param  Date type		*/
/* 16. maxDays 						해당월의 실제 날짜수 구하기 														@return String Type			@param  Date type		*/
/* 17. getStdDateToFormattedDate	영어로된 날짜를 숫자로 바꾸기 													@return String Type			@param  Date type		*/
/* 18. getTomorrow 					내일 날짜 구하기																@return String Type			@param  Date type		*/
/* 19. getTomorrow2 				내일 날짜 구하기2															@return String Type			@param  Date type		*/
/* 20. getSpecificDate 				5일 이후 날짜 구하기															@return String Type			@param  Date type		*/
/* 21. getWhatDayToday 				날짜에 해당하는 요일 구하기 														@return String Type			@param  Date type		*/
/* 22. getDiffDays 					두 날짜의 차이를 일수로 구하기2 													@return String Type			@param  Date type		*/
/* 23. GetDifferenceOfDate 			두 날짜의 차이를 일수로 구하기2 													@return String Type			@param  Date type		*/
/* 24. getDateInfoFromFile 			파일에서 날짜정보를 가져오기 													@return String Type			@param  Date type		*/
/* 25. getPrintDatesForOneYear 		날짜형식으로 2000-01-03으로 처음에 인식을 시킨후 7일씩 증가해서 1년정도의 날짜를 출력			@return String Type			@param  Date type		*/
/* 26. getDateAnswer 				오늘날짜구하기 포맷 바꾸기	 													@return String Type			@param  Date type		*/
/* 27. DateCheck 					날짜정합성여부체크		 													@return String Type			@param  Date type		*/
/****************************************************************************************************************************************************************/

public class plumCalendar {

	/**
	 * 01. 현재 시각을 가져오기.
	 * @return Sat Jul 12 16:03:00 GMT+01:00 2000
	 **/
	
	public Date getToday() {
		Date today = new Date ();
		return today;
	}

	/**
	 * 02. 시스템의 밀리초 구하기.(국제표준시각(UTC, GMT) 1970/1/1/0/0/0 으로부터 경과한 시각)
	 * @return 1531719629364
	 **/
	
	public long getMiliSeconds() {
		// 밀리초 단위(*1000은 1초), 음수이면 이전 시각
		long time = System.currentTimeMillis();
		return time;
	}

	/**
	 * 03. 경과시간(초) 구하기.(국제표준시각(UTC, GMT) 1970/1/1/0/0/0 으로부터 경과한 시각)
	 * @return 1531719629364
	 **/
	
	public long getAfterMiliSeconds(long time) {
		// 밀리초 단위(*1000은 1초), 음수이면 이전 시각
		long time1 = time - 10000;//System.currentTimeMillis();
		long time2 = System.currentTimeMillis();
		System.out.println("비교하기 TIME 1 : "+time1+"");
		System.out.println("비교하기 TIME 2 : "+time2+"\n");
		return (long) (( time2 - time1 ) / 1000.0);
	}
	
	/**
	 * 04. Date를 Calendar로 맵핑하기
	 * @return 
	 * */
	public void returnCalendar() {
		Date d = new Date ( );
		Calendar c = Calendar.getInstance ( );
		c.setTime ( d );
	}
	
	/**
	 * 05. 날짜(년/월/일/시/분/초) 구하기
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
	 * 06. 날짜(년/월/일/시/분/초) 구하기2
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
	 * 07. 날짜(년/월/일/시/분/초) 구하기3
	 * @return
	 */
	public String getDateInstance() {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
		Calendar cal = Calendar.getInstance(Locale.KOREA);
		String nbl = df.format(cal.getTime());
		return nbl;
	}

	
	/***
	 * 08. 표준시간대를 지정하고 날짜를 가져오기
	 * 결과 : 2000년 8월 5일 16시 16분 47초
	 * @param String
	 * @return String
	 */
	public String getTimeZone(String zone) {
		TimeZone jst = TimeZone.getTimeZone (zone);
		Calendar cal = Calendar.getInstance ( jst ); // 주어진 시간대에 맞게 현재 시각으로 초기화된 GregorianCalender 객체를 반환.// 또는 Calendar now = Calendar.getInstance(Locale.KOREA);
		System.out.println ( cal.get ( Calendar.YEAR ) + "년 " + ( cal.get ( Calendar.MONTH ) + 1 ) + "월 " + cal.get ( Calendar.DATE ) + "일 " + cal.get ( Calendar.HOUR_OF_DAY ) + "시 " +cal.get ( Calendar.MINUTE ) + "분 " + cal.get ( Calendar.SECOND ) + "초 " );
		return cal.get ( Calendar.YEAR ) + "년 " + ( cal.get ( Calendar.MONTH ) + 1 ) + "월 " + cal.get ( Calendar.DATE ) + "일 " + cal.get ( Calendar.HOUR_OF_DAY ) + "시 " +cal.get ( Calendar.MINUTE ) + "분 " + cal.get ( Calendar.SECOND ) + "초 " ;
	}

	
	/***
	 * 09. 영어로된 날짜를 숫자로 바꾸기
	 * 결과 : 2000년 8월 5일 16시 16분 47초
	 * @param  Date
	 * @return String
	 */
	public String getStdDateToFormattedDate(Date inDate) {
		
		Date myDate = new Date ( "Sun,5 Dec 1999 00:07:21" ); 
		System.out.println ( myDate.getYear ( ) + "-" + myDate.getMonth ( ) + "-" + myDate.getDay ( ) );
		return myDate.getYear ( ) + "-" + myDate.getMonth ( ) + "-" + myDate.getDay ( );
	}

	
	/***
	 * 10. "Sun, 5 Dec 1999 00:07:21"를 "1999-12-05"로 바꾸기
	 * 결과 : 2000년 8월 5일 16시 16분 47초
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
	 * 11. 숫자 12자리를, 다시 날짜로 변환하기
	 * 결과 : 2000년 8월 5일 16시 16분 47초
	 * @param  Date
	 * @return String
	 */
	public String getNumberToDate() {
	
		Date conFromDate = new Date();
		long ttl = Date.parse ( "Dec 25, 1997 10:10:10" );
		System.out.println ( ttl ); //예 938291839221
		 
		Date today = new Date ( ttl );
		DateFormat format = DateFormat.getDateInstance ( DateFormat.FULL,Locale.US );
		String formatted = format.format ( today );
		System.out.println ( formatted );
		return formatted;
	}

	/***
	 * 12. getDate 특정일에서 일정 기간후의 날짜 구하기
	 * 결과 : 2000년 8월 5일 16시 16분 47초
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
	 * 13. getDiffMonth 현재날짜에서 2달전의 날짜를 구하기
	 * 결과 : 2000년 8월 5일 16시 16분 47초
	 * @param  Date
	 * @return String
	 */
	public String getDiffMonth()
	{
		Calendar cal = Calendar.getInstance ( );//오늘 날짜를 기준으루..
		cal.add ( cal.MONTH, -2 ); //2개월 전....
		System.out.println ( cal.get ( cal.YEAR ) );
		System.out.println ( cal.get ( cal.MONTH ) + 1 );
		System.out.println ( cal.get ( cal.DATE ) );
		
		return cal.get ( cal.YEAR ) + ""  + cal.get ( cal.MONTH ) + 1 + "" +  cal.get ( cal.DATE );
	}
	
	/***
	 * 14. getLastMonth 달에 마지막 날짜를 구하기
	 * 결과 : 2000년 8월 5일 16시 16분 47초
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
	 * 15. getLastMonth2 특정일을 입력받아 해당 월의 마지막 날짜를 구하는 간단한 예제.(달은 -1 해준다.)...윤달 30일 31일 알아오기.
	 * 결과 :
	 * @param  Date
	 * @return String
	 */
	public String getLastMonth2(String dates)
	{
		Calendar cal = Calendar.getInstance ( );
		String[] args = dates.split(".");
		cal.set ( Integer.parseInt ( args[0] ), Integer.parseInt ( args [1] ) - 1, Integer.parseInt ( args [2] ) );
		SimpleDateFormat dFormat = new SimpleDateFormat ( "yyyy-MM-dd" );
		System.out.println ( "입력 날짜 " + dFormat.format ( cal.getTime ( ) ) );
		System.out.println ( "해당 월의 마지막 일자 : " + cal.getActualMaximum ( Calendar.DATE ) );
		return dFormat.format ( cal.getTime ( ) ) +  "해당 월의 마지막 일자 : " + cal.getActualMaximum ( Calendar.DATE ) ;
	}
	
	/***
	 * 16. maxDays 해당월의 실제 날짜수 구하기 ( 1999년 1월달의 실제 날짜수를 구하기 )
	 * 결과 :
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
	 * 17. getYesterday 어제 날짜 구하기
	 * setTime((기준일부터 오늘까지의 초를 구함) - 24*60*60)
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
	 * 18. getTomorrow 내일 날짜 구하기
	 * 결과 :
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
	 * 19. getTomorrow2 내일 날짜 구하기2
	 * 결과 :
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
	 * 20. getSpecificDate 5일 이후 날짜 구하기
	 * 결과 :
	 * @param  Date
	 * @return String
	 */
	public void getSpecificDate ()
	{
		Calendar cCal = Calendar.getInstance();
		cCal.add(Calendar.DATE, 5);
		
	}
	
	/***
	 * 21. getWhatDayToday 날짜에 해당하는 요일 구하기
	 * 결과 :
	 * @param  Date
	 * @return String
	 */
	public String getWhatDayToday ()
	{
		//DAY_OF_WEEK리턴값이 일요일(1), 월요일(2), 화요일(3) ~~ 토요일(7)을 반환합니다.
		//아래 소스는 JSP일부입니다.		 
		Calendar cal= Calendar.getInstance ( );
		int day_of_week = cal.get ( Calendar.DAY_OF_WEEK );
		String m_week="";
		if ( day_of_week == 1 )
		m_week="일요일";
		else if ( day_of_week == 2 )
		m_week="월요일";
		else if ( day_of_week == 3 )
		m_week="화요일";
		else if ( day_of_week == 4 )
		m_week="수요일";
		else if ( day_of_week == 5 )
		m_week="목요일";
		else if ( day_of_week == 6 )
		m_week="금요일";
		else if ( day_of_week == 7 )
		m_week="토요일";	
		
		return m_week;
	}
	
	/***
	 * 21. getEngDays 날짜에 해당하는 요일 구하기
	 * 결과 :
	 * @param  Date
	 * @return String
	 */
	public String getEngDays()
	{
		//gc.get(gc.DAY_OF_WEEK); 하면 일요일=1, 월요일=2, ..., 토요일=7이 나오니까,
		//요일을 배열로 만들어서 뽑아내면 되겠죠.
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
	 * 22. getDiffDays 두 날짜의 차이를 일수로 구하기2
	 * 결과 :
	 * @param  Date
	 * @return String
	 */
	public void getDiffDays()
	{
		Date today = new Date ( );
		Calendar cal = Calendar.getInstance ( );
		cal.setTime ( today );// 오늘로 설정.
		 
		 
		Calendar cal2 = Calendar.getInstance ( );
		cal2.set ( 2000, 3, 12 ); // 기준일로 설정. month의 경우 해당월수-1을 해줍니다.
		 
		 
		int count = 0;
		while ( !cal2.after ( cal ) )
		{
			count++;
			cal2.add ( Calendar.DATE, 1 ); // 다음날로 바뀜
			 
			 
			System.out.println ( cal2.get ( Calendar.YEAR ) + "년 " + ( cal2.get ( Calendar.MONTH ) + 1 ) + "월 " + cal2.get ( Calendar.DATE ) + "일" );
		}
		 
		System.out.println ( "기준일로부터 " + count + "일이 지났습니다." );
	}

	/***
	 * 23. GetDifferenceOfDate 두 날짜의 차이를 일수로 구하기2
	 * 결과 :
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
	 * 24. getDateInfoFromFile 파일에서 날짜정보를 가져오기
	 * 결과 :
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
	 * 25. getPrintDatesForOneYear 날짜형식으로 2000-01-03으로 처음에 인식을 시킨후 7일씩 증가해서 1년정도의 날짜를 출력
	 * 결과 :
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
	 * 문제 : 쓰레드에서 날짜 바꾸면 죽는 문제 Main화면에 날짜와시간이Display되는 JPanel이 있습니다. 
	 * date로 날짜와 시간을 변경하면 Main화면의 날짜와 시간이 Display되는 Panel에 변경된 날짜가 Display되지 않고 Main화면이 종료되어 버립니다. 
	 * 문제소스:
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
	 * 26. getDateAnswer 오늘날짜구하기 포맷 바꾸기
	 * 결과 :
	 * @param  Date
	 * @return String
	 */
	public String getDateAnswer ( )
	{
		// 날짜와 요일 구한다. timezone 으로 날짜를 다시 셋팅하시면 됨니다.
		Date now = new Date ( );
		SimpleDateFormat sdf4 = new SimpleDateFormat ( "yyyy/MM/dd HH:mm EE" );
		sdf4.setTimeZone ( TimeZone.getTimeZone ( "Asia/Seoul" ) );
		 
		return sdf4.format ( now );
	}
	

	/***
	 * 27. DateCheck 날짜정합성여부체크
	 * 결과 :
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


