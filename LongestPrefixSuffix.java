/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		prefix(s);
		
	}
	static void prefix(String s){
	    int n=s.length();
	    int lps[]=new int[n];
	    Arrays.fill(lps,0);
	    int i=1;
	    int len=0;
	    while(i<n){
	        if(s.charAt(i)==s.charAt(len)){
	            
	            len++;
	            lps[i]=len;
	            i++;
	        }
	        else{
	        if(len==0)
	        {
	            lps[i]=0;
	            i++;
	        }
	       else if(len>0)
	            len=lps[len-1];
	        }
	    }
	    System.out.println(Arrays.toString(lps));
	}
}
