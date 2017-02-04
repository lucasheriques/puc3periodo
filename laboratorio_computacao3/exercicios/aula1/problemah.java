import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.lang.String;

public class problemah {

	static InputStream is = System.in;
	static InputStreamReader isr = new InputStreamReader(is);
	static BufferedReader in = new BufferedReader(isr);

	public static String removeVowels(String s) {

		String noVowel = "";

		for (int i = 0; i < s.length(); i++) {
			if (new String("aeiouAEIOU").contains(String.valueOf(s.charAt(i)))) noVowel += ""+s.charAt(i);
		}

		return noVowel;
	}

	public static String reverseString(String s) {

		String reverse = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i);
		}

		return reverse;
	}

	public static void main(String[] args) {

		String a = "bfasdfasseeeeeeaa";

		System.out.println(removeVowels(a));

		System.out.println("Reverse string: " + reverseString(a));

	}
}
