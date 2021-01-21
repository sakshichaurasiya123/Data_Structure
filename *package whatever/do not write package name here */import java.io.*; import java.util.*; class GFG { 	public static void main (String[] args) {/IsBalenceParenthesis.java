/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner in=new Scanner(System.in);
		String s=in.next();
		Stack<Character>st=new Stack<Character>();
		
		for(int i=0; i<s.length(); i++){
		   if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
		            st.push(s.charAt(i));
		    else {
		        if(st.size()==0){
		           System.out.println("No");
		        }
		        else if(matching(st.peek(),s.charAt(i))==false){
		            System.out.println("No");
		            return;
		        }
		        else{
		            st.pop();
		        }
		    }   
		}
		if(st.size()==0)
		    System.out.println("Yes");
		
	}
	static boolean matching(char a,char b){
	    return ((a=='('&& b==')')|| (a=='{' && b=='}') || (a=='[' && b==']'));
	}
}
