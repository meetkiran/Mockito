package com.in28minutes.junit.helper;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class SecondUniqueChar {
	public static void main(String[] args) {
		SecondUniqueChar.secondNonRepeating("india");
		SecondUniqueChar.secondNonRepeating("Mumbai");
	}

	static void secondNonRepeating(String str) {
		str = str.toLowerCase();
		LinkedHashMap<Character, Boolean> hs = new LinkedHashMap<>();
		int sl = str.length();
		for (int i = 0; i < sl; i++) {
			char ch = str.charAt(i);
			if (hs.containsKey(ch)) {
				hs.put(ch, false);
			} else {
				hs.put(ch, true);
			}
		}
		int cnt = 0;
		Iterator<Character> itr = hs.keySet().iterator();
		while (itr.hasNext()) {
			char ch = itr.next();
			if (hs.get(ch)) {
				cnt++;
				if (cnt == 2) {
					System.out.println(ch);
					break;
				}
			}
		}
		if (cnt < 2)
			System.out.println("no 2nd non-rep char");

	}
}