package Assignment;
import java.util.Scanner;
public class Characterrepeatedcount {
	 public static void main(String[] args) {
		 Scanner a=new Scanner(System.in);
		 System.out.println("enter the string");
	       String s=a.next();
	       char [] ch=s.toCharArray();
	       for(int i=0;i<ch.length;i++) {
	    	   char ch1=ch[i];
	    	   int count=1;
	    	   int l=ch.length;
	    	   if(ch[i]=='\u0000')continue;
	    	   for(int j=i+1;j<ch.length;j++) {  
	    		   char ch2=ch[j];
	    		   if(ch[i]==ch[j]) {
	    			   count++;
	    			   ch[j]='\u0000';
	    		   }
	    	   }
	    	   if(count>1)
	    		   System.out.println(ch[i]+"="+count);
	    	   else if(count==1&&i==ch.length) {
	    		   System.out.println("-1");
	    	   }
	    	   }
	      
	       }
	       }
	 
	
