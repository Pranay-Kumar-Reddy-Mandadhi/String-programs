package Assignment;

public class panagramString {
public static void main(String[] args) {
	String s="abcdefghijklmnopqrstuvwxyz";
	String s2="a quick brown fox jumps over the lazy dog ";
	String s3="";
	int count=0;
	for(int i=0;i<s.length();i++) 
	{
		char ch=s.charAt(i);
		if(s2.length()>26) {
		if(s2.indexOf(ch)==-1) {
			continue;
		
		}
		else {
			s3+=ch;
			count++;
			
			
		}
	}
	}
	System.out.println(count);
		if(count==26) {
			System.out.println(s2+ " is panagram string");
		}else {
			System.out.println(s2+ "is not a panagram string");
		}
	}
	
			
}

