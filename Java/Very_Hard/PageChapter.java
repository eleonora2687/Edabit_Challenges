// Nearest Chapter

// Create a function that returns which chapter is nearest to the page you're on. If two chapters are equidistant, return the chapter with the higher page number.


/* import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class PageChapter {

    public static void main(String[] args) {
		ArrayList<Map.Entry<String, Integer> > m = new ArrayList<Map.Entry<String, Integer> >(
			Arrays.asList(
				new SimpleEntry<String, Integer>("Chapter 1", 1),
				new SimpleEntry<String, Integer>("Chapter 2", 15),
				new SimpleEntry<String, Integer>("Chapter 3", 37)	
		));
		System.out.println(closestToPage(m, 10));

		ArrayList<Map.Entry<String, Integer> > m1 = new ArrayList<Map.Entry<String, Integer> >(
			Arrays.asList(
				new SimpleEntry<String, Integer>("New Beginnings", 1),
				new SimpleEntry<String, Integer>("Strange Developments", 62),
				new SimpleEntry<String, Integer>("The End?", 194),
				new SimpleEntry<String, Integer>("The True Ending", 460)	
		));
		System.out.println(closestToPage(m1, 200));

		ArrayList<Map.Entry<String, Integer> > m2 = new ArrayList<Map.Entry<String, Integer> >(
			Arrays.asList(
				new SimpleEntry<String, Integer>("Chapter 1a", 1),
				new SimpleEntry<String, Integer>("Chapter 1b", 5)
				
		));
		System.out.println(closestToPage(m2, 3));
	
		ArrayList<Map.Entry<String, Integer> > m3 = new ArrayList<Map.Entry<String, Integer> >(
			Arrays.asList(
				new SimpleEntry<String, Integer>("Chapter 1a", 1),
				new SimpleEntry<String, Integer>("Chapter 1b", 5),
				new SimpleEntry<String, Integer>("Chapter 1c", 50),
				new SimpleEntry<String, Integer>("Chapter 1d", 100)	
		));

		System.out.println(closestToPage(m1, 75));

		ArrayList<Map.Entry<String, Integer> > m4 = new ArrayList<Map.Entry<String, Integer> >(
			Arrays.asList(
				new SimpleEntry<String, Integer>("Chapter 1a", 1),
				new SimpleEntry<String, Integer>("Chapter 1b", 5),
				new SimpleEntry<String, Integer>("Chapter 1c", 50),
				new SimpleEntry<String, Integer>("Chapter 1d", 100),
				new SimpleEntry<String, Integer>("Chapter 1e", 200)
		));
		System.out.println(closestToPage(m4, 150));

		ArrayList<Map.Entry<String, Integer> > m5 = new ArrayList<Map.Entry<String, Integer> >(
			Arrays.asList(
				new SimpleEntry<String, Integer>("Chapter 1a", 1),
				new SimpleEntry<String, Integer>("Chapter 1b", 5),
				new SimpleEntry<String, Integer>("Chapter 1c", 50),
				new SimpleEntry<String, Integer>("Chapter 1d", 100),
				new SimpleEntry<String, Integer>("Chapter 1e", 200)

		));
		System.out.println(closestToPage(m5, 74));

		ArrayList<Map.Entry<String, Integer> > m6 = new ArrayList<Map.Entry<String, Integer> >(
			Arrays.asList(
				new SimpleEntry<String, Integer>("Chapter 1a", 1),
				new SimpleEntry<String, Integer>("Chapter 1b", 5),
				new SimpleEntry<String, Integer>("Chapter 1c", 50),
				new SimpleEntry<String, Integer>("Chapter 1d", 100),
				new SimpleEntry<String, Integer>("Chapter 1e", 200),
				new SimpleEntry<String, Integer>("Chapter 1f", 400)

		));
		System.out.println(closestToPage(m6, 300));
	
	
	}

		

	public static String closestToPage(ArrayList<Map.Entry<String, Integer> > c, int p) {
		int closest = Integer.MAX_VALUE;
		String chapter = "";
		int pages = 0;

		for (int i = 0; i < c.size(); i++) {
			Map.Entry<String, Integer> m = c.get(i);
			int temp = Math.abs(m.getValue()- p);
			if (temp < closest) {
				closest = temp;
				chapter = m.getKey();
				pages = m.getValue();
			} else if (temp == closest && m.getValue() > pages) {
					closest = temp;
					chapter = m.getKey();
					pages = m.getValue();
			}
		}
		return chapter;
}
} */

import java.util.Hashtable;

public class PageChapter {
	public static void main(String[] args) {
		System.out.println(titleToNumber("A"));
		System.out.println(titleToNumber("R"));
		System.out.println(titleToNumber("AB"));
		System.out.println(titleToNumber("ZY"));
		System.out.println(titleToNumber("KFC"));
		System.out.println(titleToNumber("WEB"));
		System.out.println(titleToNumber("FANG"));
		System.out.println(titleToNumber("CODE"));
		System.out.println(titleToNumber("AGILE"));
		System.out.println(titleToNumber("EDABIT"));
		System.out.println(titleToNumber("PYTHON"));
		System.out.println(titleToNumber("ANISTON"));
		System.out.println(titleToNumber("FRIENDS"));
	}

	public static int titleToNumber(String s) {

		int n = s.length();

		int res=0;
		Hashtable<Character, Integer> my_dict = new Hashtable<Character, Integer>();

		my_dict.put('A', 1);
		my_dict.put('B', 2);
		my_dict.put('C', 3);
		my_dict.put('D', 4);
		my_dict.put('E', 5);
		my_dict.put('F', 6);
		my_dict.put('G', 7);
		my_dict.put('H', 8);
		my_dict.put('I', 9);
		my_dict.put('J', 10);
		my_dict.put('K', 11);
		my_dict.put('L', 12);
		my_dict.put('M', 13);
		my_dict.put('N', 14);
		my_dict.put('O', 15);
		my_dict.put('P', 16);
		my_dict.put('Q', 17);
		my_dict.put('R', 18);
		my_dict.put('S', 19);
		my_dict.put('T', 20);
		my_dict.put('U', 21);
		my_dict.put('V', 22);
		my_dict.put('W', 23);
		my_dict.put('X', 24);
		my_dict.put('Y', 25);
		my_dict.put('Z', 26);
				
		for (int i = 0; i < s.length(); i++) {
			res+=Math.pow(26, i)*my_dict.get(s.charAt(n - 1 - i));
		}return res;
	}
}