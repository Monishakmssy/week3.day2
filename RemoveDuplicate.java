package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicate {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Testleaf";
	    char[] charArray = input.toCharArray();
	    Set<Character>unique=new LinkedHashSet<Character>();
	    for (int i = 0; i < charArray.length; i++) {
	    if(!unique.add(charArray[i])) {
	        unique.remove(charArray[i]);
	    	 }	
		}
	     System.out.println(unique);    
	}
}