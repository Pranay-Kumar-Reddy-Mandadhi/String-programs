package Pack1;

import java.util.Scanner;

public class CharacterCount {
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		String a=s.next();
		int lcount=0;
		int ucount=0;
		int ncount=0;
		int spcount=0;
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				lcount++;
			}
			else if(ch>='A'&&ch<='Z')
			{
				ucount++;
			}
			else if(ch>='0'&&ch<='9') {
				ncount++;
			}
			else {
				spcount++;
			}
			
		}
		System.out.println("lowercase count="+lcount);
		System.out.println("upper case count="+ucount);
		System.out.println("number  count="+ncount);
		System.out.println("special character count="+spcount);
}
}
