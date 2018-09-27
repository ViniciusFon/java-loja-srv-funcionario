package br.com.fontana.loja.funcionario.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatUtils {

	private static DateFormat sdf_DT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static DateFormat sdf_D = new SimpleDateFormat("dd/MM/yyyy");
  private static final String doubleFormat = "%1$,.1f";
  private static final String floatFormat = "%1$,.1f";

	public static String parseDate(Date date) {
		return parseDate(date, true);
	}

	public static String parseDate(Date date, Boolean putHifen) {
		return date == null ? putHifen? "-":"" : sdf_D.format(date);
	}

	public static String parseDateTime(Date date) {
		return parseDateTime(date, true);
	}

	public static String parseDateTime(Date date, Boolean putHifen) {
		return date == null ? putHifen?"-":"" : sdf_DT.format(date);
	}

	public static String parseString(Object object) {
		return parseString(String.valueOf(object), true);
	}
	
	public static String parseString(Object object, Boolean putHifen) {
		return parseString(String.valueOf(object), putHifen);
	}
	
	
	public static String parseString(String string) {
		return parseString(string, true);
	}
	
	public static String parseString(String string, Boolean putHifen) {
		return ValidatorUtils.isNullOrEmpty(string) ? putHifen?"-":"" : string;
	}

	public static String parseDouble(Double dbl){
		return parseDouble(dbl, true);
	}

	public static String parseDouble(Double dbl, Boolean putHifen) {
		return dbl == null || dbl.isNaN() || dbl.isInfinite() ? putHifen?"-":"" : String.valueOf(dbl);
	}

	public static String parseFloat(Float fl) {
		return parseFloat(fl, true);
	}

	public static String parseFloat(Float fl, Boolean putHifen) {
		return fl == null || fl.isNaN() || fl.isInfinite() ? putHifen?"-":"" : String.valueOf(fl);
	}

	public static String parseDoubleAndFormat(Double dbl) {
		return parseDoubleAndFormat(dbl,true);
	} 

	public static String parseDoubleAndFormat(Double dbl, Boolean putHifen) {
		return dbl == null || dbl.isNaN() || dbl.isInfinite() ? putHifen?"-":"" : String.format(doubleFormat, dbl);
	}

	public static String parseFloatAndFormat(Float fl) {
		return parseFloatAndFormat(fl, true);
	}

	public static String parseFloatAndFormat(Float fl, Boolean putHifen) {
		return fl == null || fl.isNaN() || fl.isInfinite() ? putHifen?"-":"" : String.format(new Locale("en_US"), floatFormat, fl);
	}
}
