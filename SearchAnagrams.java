/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String txt=in.next();
		String patt=in.next();
		Anagrams(txt,patt);
	}
	static void Anagrams(String txt,String pat){
	    int counttxt[]=new int[256];
	    int countpat[]=new int[256];
	    for(int i=0; i<pat.length(); i++){
	        countpat[pat.charAt(i)]++;
	        counttxt[txt.charAt(i)]++;
	    }
	    for(int i=pat.length(); i<txt.length(); i++){
	        if(isSame(countpat,counttxt))
	           {
	               System.out.println("True");
	               return;
	           }
	           counttxt[txt.charAt(i)]++;
	           counttxt[txt.charAt(i-pat.length())]--;
	    }
	    System.out.println("No");
	}
	static boolean isSame(int a[],int b[]){
	    if(Arrays.equals(a,b))
	        return true;
	   return false;
	}
}
