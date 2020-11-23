import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
	ArrayList<Integer>arr=new ArrayList<Integer>();
		for(int i=0; i<n; i++)
		    arr.add(in.nextInt());
		    randompossibility(arr,n);
	}
	static void   randompossibility(List<Integer>arr,int n){
	   Map<Integer,Integer>map=new LinkedHashMap<Integer,Integer>();
	   for(int k:arr)
	    map.put(k,map.getOrDefault(k,0)+1);
	 int maxOccuring=arr.get(0);
	 for(var pair :map.entrySet()){
	     if(map.get(maxOccuring)>pair.getValue())
	        maxOccuring=pair.getKey();
	 }
	 int k=rand(1,map.get(maxOccuring));
	 int index=0;
	 while(k!=0 && index<arr.size())
	 {
	     if(arr.get(index)==maxOccuring)
	        k--;
	   index++;
	 }
	 for(int i=0; i<index-1; i++)
	    System.out.print(arr.get(i));
	}
	static int rand(int min,int max){
	    if(min>max  || (max-min+1)>Integer.MAX_VALUE)
	        throw new IllegalArgumentException("Invalid Range");
	   else
	    return new Random().nextInt(max-min+1)+min;
	        
	}
	
}