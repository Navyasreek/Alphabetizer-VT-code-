
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		List<String> cList = new ArrayList<String>();

		str = str.replaceAll("[^a-zA-Z]", "");
		int len = str.length();
		for (int i = 0; i < len; i++) {
			cList.add(str.substring(0, 1));
			str = str.substring(1);
		}
		String result = "";
		Collections.sort(cList, String.CASE_INSENSITIVE_ORDER);
		for (String s : cList) {
			result += s;

		}
		System.out.println(result);
		sc.close();

	}

}