package Pack1;

import java.util.Scanner;


public class VowelCount {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		String a=s.next();
		int count=0;
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
			
		}
		System.out.println(count);
	}
}
