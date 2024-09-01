package Assignment;

import java.util.Scanner;

public class Removerepetedchar {
	 public static void main(String[] args) {
		 Scanner a=new Scanner(System.in);
		 System.out.println("enter the string");
	       String s=a.next();
	       String dus=s;
	       int count=0;
	       char [] ch=s.toCharArray();
	       char[] chd=dus.toCharArray();
	       for(int i=0;i<ch.length;i++) {
	    	   for(int j=i+1;j<chd.length;j++) {
	    		   if(ch[i]==chd[j]) {
	    			   count++;
	    			   if(count%2!=0) {
	    				   chd[j]=' ';
	    			   }else {
	    				  continue;
	    			   }
	    		   }
	    	   }
	       }
	       System.out.println(chd);
	    }
	}

