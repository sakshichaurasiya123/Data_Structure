/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String b=in.next();
		if(s.length()!=b.length()){
		    System.out.println("No");
		}
		s=s+s;
		int index=s.indexOf(b);
		if(index>=0)
		    System.out.println("Yes");
	    else
	        System.out.println("No");
	}
}
