package Assignment;

public class Charactercountkey {
	 public static void main(String[] args) {
	       String s="mandadhi parany kumar reddy";       
	       int count=0;
	       char [] ch=s.toCharArray();
	       char key='a';
	       for(int i=0;i<ch.length;i++) {  
	    		   if(key==ch[i]) {
	    			   count++; 
	    	   }
	       }
	       System.out.println(key+"="+count);
	    }
	 }
	
