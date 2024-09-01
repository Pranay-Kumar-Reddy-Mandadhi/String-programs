package Assignment;

import java.util.Scanner;

public class Arrangethecharcters {
    public static void main(String[] args) {
    	 Scanner a=new Scanner(System.in);
		 System.out.println("enter the string");
	       String s=a.next();
        char[] ch = s.toCharArray();
        
        for(int i = 0; i < ch.length; i++) {
            for(int j = i + 1; j < ch.length; j++) {
                if(ch[i] > ch[j]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        System.out.println(ch);
        
    }
}
