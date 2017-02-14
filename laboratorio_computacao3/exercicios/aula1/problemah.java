import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.lang.String;
import java.io.IOException;

public class problemah {

	static InputStream is;
	static InputStreamReader isr;
	static BufferedReader in;

	public static String removeConsonants(String s) {
		String noConsonants = "";

		for (int i = 0; i < s.length(); i++) {
			if (new String("aeiouAEIOU").contains(String.valueOf(s.charAt(i)))) noConsonants += ""+s.charAt(i);
		}

		return noConsonants;
	}

	public static String reverseString(String s) {
		String reverse = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i);
		}

		return reverse;
	}

	public static void main(String[] args) throws IOException {

    is = System.in;
    isr = new InputStreamReader(is);
    in = new BufferedReader(isr);

		String a = in.readLine();

    while (!a.equals("FIM")) {
      a = removeConsonants(a);
      if (a.equals(reverseString(a))) System.out.println("S");
      else System.out.println("N");

      a = in.readLine();
    }

	}
}
