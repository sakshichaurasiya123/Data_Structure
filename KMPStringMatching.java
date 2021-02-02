/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String patt=in.next();
		kmp(patt,s);
		
	}
	static void prefix(String s,int lps[]){
	    int n=s.length();
	   
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
	static void kmp(String patt,String txt){
	    int N=txt.length();
	    int M=patt.length();
	    int lps[]=new int[M];
	    prefix(patt,lps);
	    int i=0;int j=0;
	    while(i<N){
	        if(patt.charAt(j)==txt.charAt(i)){
	            i++;
	            j++;
	        }
	        if(j==M){
	            System.out.println(i-j);
	            j=lps[j-1];
	        }   
	        else if(i<N && patt.charAt(j)!=txt.charAt(i)){
	            if(j==0)
	                i++;
	           else
	            j=lps[j-1];
	        }
	   }
	}
}
