import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws ParseException {
		
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		List<String> cList = new ArrayList<String>();
		
		str = str.replaceAll("[^a-zA-Z]","");
		int len=str.length();
		for(int i=0;i<len;i++) {
		    cList.add(str.substring(0, 1));
		    str=str.substring(1);
		}
		
		
		Comparator<String> ALPHABETICAL_ORDER = new Comparator<String>() {
		    public int compare(String str1, String str2) {
		        int res = String.CASE_INSENSITIVE_ORDER.compare(str1, str2);
		        if (res == 0) {
		            res = str1.compareTo(str2);
		        }
		        return res;
		    }
		};
		String result="";
		Collections.sort(cList, ALPHABETICAL_ORDER);
		for(String s:cList) {
			result+=s;
		 
		}
		System.out.println(result); 
	sc.close();
	
		
	}
}