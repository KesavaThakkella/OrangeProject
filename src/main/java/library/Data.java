package library;

import java.util.HashMap;

public class Data {

	public static HashMap<Integer, String> monthmap() {

		HashMap<Integer, String> monthmap = new HashMap<Integer, String>();
		monthmap.put(1, "Jan");
		monthmap.put(2, "Feb");
		monthmap.put(3, "Mar");
		monthmap.put(4, "Apr");
		monthmap.put(5, "May");
		monthmap.put(6, "Jun");
		monthmap.put(7, "Jul");
		monthmap.put(8, "Aug");
		monthmap.put(9, "Sep");
		monthmap.put(10, "Oct");
		monthmap.put(11, "Nov");
		monthmap.put(12, "Dec");

		return monthmap;

	}

}
