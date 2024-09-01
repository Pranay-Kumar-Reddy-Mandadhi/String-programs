package Assignment;

public class RemoveDuplicateWords {
		public static void main(String[] args) {
			String s="happy happy birthday";
			char[]ch=s.toCharArray();
			String str2="";
			for(int i=0;i<ch.length;i++) {
				for(int j=0;j<ch.length;j++) {
					if(ch[j]!=' ') {
						str2+=ch[j];
					}
					
					i=j;
					
				}
				System.out.println(str2);
			}
			System.out.println(str2);
		}
		
}
