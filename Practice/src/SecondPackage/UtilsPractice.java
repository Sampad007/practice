package SecondPackage;

import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.util.Calendar;

public class UtilsPractice {
	private static SecureRandom random= new SecureRandom();
	static String reportName=null;
	
	public static String getRandomString(int length) {
		String randomString="";
		try {
			randomString= new BigInteger(Long.SIZE*length, random).toString(32);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return randomString.substring(0, length);
	}
	
	public static String setReportName() {
		try {
			if(reportName==null) {
				Calendar cal = Calendar.getInstance();
				reportName = "Report-" + cal.get(Calendar.DAY_OF_MONTH) + "-"
						+ (cal.get(Calendar.MONTH) + 1) + "-"
						+ cal.get(Calendar.YEAR) + "_"
						+ cal.get(Calendar.HOUR_OF_DAY) + "-"
						+ cal.get(Calendar.MINUTE) + "-" + cal.get(Calendar.SECOND)
						+ "-" + cal.get(Calendar.MILLISECOND) + "_"
						+ getRandomString(5).toUpperCase();
				System.out.println("ReportName: "+reportName);
			} else {
				reportName= InetAddress.getLocalHost().getHostName();
			}
			
		} catch (UnknownHostException u) {
			// TODO: handle exception
		}
		return reportName;
	}
		
}
