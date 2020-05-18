package com.luis.enterpriseusers.utils.helpers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateHelper {
	
	private Calendar calendar;
	
	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	public Date StringToDate(String s) {

	    Date result = null;
	    
	    try {
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // ("yyyy-MM-dd HH:mm:ss");
	        result  = dateFormat.parse(s);
	    } catch(ParseException e) {
	        e.printStackTrace();
	        return null;
	    }
	    
	    return result;
	}
	
	public int getDay() {
		return getCalendar().get(Calendar.DAY_OF_MONTH);
	}
	
	public int getMonth() {
		return getCalendar().get(Calendar.MONTH);
	}
	
	public int getYear() {
		return getCalendar().get(Calendar.YEAR);
	}
	
	public int getDay(Date date) {
		Calendar calendarBirth = Calendar.getInstance();
		calendarBirth.setTime(date);
		return calendarBirth.get(Calendar.DAY_OF_MONTH);
	}
	
	public int getMonth(Date date) {
		Calendar calendarBirth = Calendar.getInstance();
		calendarBirth.setTime(date);
		return calendarBirth.get(Calendar.MONTH);
	}
	
	public int getYear(Date date) {
		Calendar calendarBirth = Calendar.getInstance();
		calendarBirth.setTime(date);
		return calendarBirth.get(Calendar.YEAR);
	}

}
