package nestedFor.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfSentence {
	public static void main(String[] args) {

		String s = "Hello Welcome To Java Class Java";
		String[] split = s.split(" ");
		Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
		for (String c : split) {
			if (mp.containsKey(c)) {
				Integer count = mp.get(c);
				mp.put(c, count + 1);
			} else {
				mp.put(c, 1);
			}
		}
		System.out.println(mp);
	}

}
