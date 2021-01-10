package ncs.test3;

import java.lang.reflect.Member;///수를 멤버 배열에 담으려 햤다.
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;//배열로 담아서 토커나이저 사용하려 했음

public class DateTest {

	public static void main(String[] args) {

		Calendar cal = new GregorianCalendar(1987,(5-1),27);//5-1을 안해주면 월이 6월로 출력됨
		Calendar now = new GregorianCalendar();
		SimpleDateFormat f = new SimpleDateFormat("yyyy년  M월  dd일");
		char[] c = {'일','월','화','수','목','금','토'}; 
		
		System.out.println("생일 : "+f.format(new Date(cal.getTimeInMillis()))+" "+c[cal.DAY_OF_WEEK-1]+"요일");
		System.out.println("현재 : "+f.format(new Date(now.getTimeInMillis())));
		
		long diff = now.getTimeInMillis()-cal.getTimeInMillis();
		System.out.println(diff/1000/60/60/24/365 + " 세");
		
		
	
			
		
		
	
		
		
		
		
		
	}
	
}
