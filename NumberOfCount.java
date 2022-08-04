package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberOfCount {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			int count=0;
		List<String> list = new ArrayList<String>();
		list.add("Adam");
		list.add("Ben");
		list.add("Zara");
		list.add("Adam");
		list.add("Charlie");
		list.add("James");
		list.add("Ben");
		Collections.sort(list);
		for(int i=0; i<(list.size()-1); i++) {
	    if(list.get(i)=="Adam") {
	    	count++;
	    }
	    System.out.println(count);
		}
	}

}
