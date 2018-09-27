
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader file = new FileReader("C:\\Users\\Navya\\Desktop\\Testdata.txt");
		BufferedReader br = new BufferedReader(file);

		String str;
		try {
			while ((str = br.readLine()) != null) {

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
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// sc.close();

	}

}