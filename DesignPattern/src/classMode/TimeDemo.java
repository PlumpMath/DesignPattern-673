package classMode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDemo {
	public void showTime() {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println("date:"+date);
		SimpleDateFormat ft=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String t1="2014-11-24 14:24:51";
		String t2="2015-11-24 14:24:51";
		try {
			Date myDate=ft.parse(t1);
			System.out.println();
			System.out.println(myDate+"=====");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ft.format(date));
	}
}
