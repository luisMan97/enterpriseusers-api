package com.luis.enterpriseusers.utils.helpers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {
	
	public Date StringToDate(String s) {

	    Date result = null;
	    
	    try {
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // ("yyyy-MM-dd HH:mm:ss");
	        result  = dateFormat.parse(s);
	    } catch(ParseException e) {
	        e.printStackTrace();
	    }
	    
	    return result;
	}

}
