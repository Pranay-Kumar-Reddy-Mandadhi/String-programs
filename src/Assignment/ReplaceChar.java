package Assignment;

public class ReplaceChar {
	public static void main(String[] args) {
		String s="Pranay1312421kumarre122313ddy";
		char[] str=s.toCharArray();
		String s2="";
		for(int i=0;i<str.length;i++) {
			if(str[i]>='1'&& str[i]<='9') {
				continue;
			}
			else {
				s2+=str[i];
			}
		}
		System.out.println(s2);
	}
}
