package vovels;

import java.util.*;

public class vowels {
	public static void main(String[] args) {
		String str = "Education";
		boolean a = false;
		boolean e = false;
		boolean i = false;
		boolean o = false;
		boolean u = false;
		str = str.toLowerCase();
		for (int m = 0; m < str.length(); m++) {
			if (str.charAt(m) == 'a') {
				a = true;
			} else if (str.charAt(m) == 'e') {
				e = true;
			} else if (str.charAt(m) == 'i') {
				i = true;
			} else if (str.charAt(m) == 'o') {
				o = true;
			} else if (str.charAt(m) == 'u') {
				u = true;
			}

		}
		System.out.println(a && e && i && o && u);

	}

}
