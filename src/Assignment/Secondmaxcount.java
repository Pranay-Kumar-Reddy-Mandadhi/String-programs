package Assignment;

import java.util.Scanner;

public class Secondmaxcount {
	public static void main(String[] args) {
		 Scanner a=new Scanner(System.in);
		 System.out.println("enter the string");
	       String s=a.next();
	       int maxcount=0;
	       int secmaxcount=0;
	       char maxchar=' ';
	       char secmaxchar=' ';
	       
	       
	       char [] ch=s.toCharArray();
	       for(int i=0;i<ch.length;i++) {
	    	   char ch1=ch[i];
	    	   int count=1;
	    	   if(ch[i]=='\u0000')continue;
	    	   for(int j=i+1;j<ch.length;j++) {
	    		   
	    		   char ch2=ch[j];
	    		   if(ch[i]==ch[j]) {
	    			   count++;
	    			   ch[j]='\u0000';
	    		   }
	    	   }
	    	   if(count>maxcount) {
	    		   secmaxcount=maxcount;
	    		   maxcount=count;
	    		   secmaxchar=maxchar;
	    		   maxchar=ch1;
	    	   }
	    	   else if(count>secmaxcount&&count!=maxcount) {
	    		   secmaxchar=ch[i];
	    		   secmaxcount=count;
	    	   }
	    	   }
	       System.out.println(secmaxchar+"="+secmaxcount);
	      
	       }
	       
}
