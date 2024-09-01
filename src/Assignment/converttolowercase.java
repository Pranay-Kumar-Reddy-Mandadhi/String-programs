package Assignment;

import java.util.Scanner;

public class converttolowercase {
	public static void main(String[] args) {
		 Scanner a=new Scanner(System.in);
		 System.out.println("enter the string");
	       String s=a.next();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int ch1=ch[i];
			if(ch1>='a'&&ch1<='z') {
			continue;
	}
			else if(ch1>='A'&&ch1<='Z'){
				ch[i]=(char)(ch1+32);
			}
		}
		System.out.println(ch);
	}
}
