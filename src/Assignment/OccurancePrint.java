package Assignment;

public class OccurancePrint {
	public static void main(String[] args) {
		
		
		String s="a3s4g6";
	
		char[] ch=s.toCharArray();
		String s1="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='1'&& ch[i]<='9') {
				for(int j=1;j<(ch[i]-48);j++) {
					s1+=ch[i-1];
				}
			}
			else {
				s1+=ch[i];
			}
		}
		System.out.println(s1);
		
}
}
