package Assignment;

public class CountNumberOfWords {
	public static void main(String[] args) {
		String s="java is easy";
		int count=1;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			int j=0;
			for(;j<s.length();j++) {
				char ch1=s.charAt(j);
				if(ch1==' ') {
					count++;
				}
				
			}
			i=j;
		}
		System.out.println("No of words in the string is ="+count);
	}
}
