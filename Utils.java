package cn.kgc.tangcco.zhanglixia.common;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {
	public static final String FLIGHTDAO = "flightDao";
	public static final String FLIGHTSERVICE = "flightService";
	
	public static LocalDateTime toDateTime(String string) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime datetime = LocalDateTime.parse(string,formatter);
		return datetime;
	}
	
	public static String toString(LocalDateTime datetime) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return datetime.format(formatter);
	}
}
