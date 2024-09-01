package Assignment;

import java.util.Scanner;

public class mincountofchar {
public static void main(String[] args) {
	 Scanner a=new Scanner(System.in);
	 System.out.println("enter the string");
       String s=a.next();
       int mincount=s.length();
       char minchar=' ';
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
    	   if(count<mincount) {
    		   mincount=count;
    		   minchar=ch[i];
    	   }
}
       System.out.println(minchar+"="+mincount);
}
}
