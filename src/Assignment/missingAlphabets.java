package Assignment;

public class missingAlphabets {
public static void main(String[] args) {
	String s2="abc";
	String s="abcdefghijklmnopqrstuvwxyz";
	String s3="";
	for(int i=0;i<s.length();i++) 
	{
		char ch=s.charAt(i);
		if(s2.indexOf(ch)==-1) {
		s3+=ch;
		
		}
		else {
			continue;
			
		}
	}
		System.out.println(s3);
	
			
}
}
