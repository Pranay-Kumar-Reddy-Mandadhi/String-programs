package Assignment;

public class LengthofString {
		public static void main(String[] args) {
			String s="pranay kumar reddy";
			char[] str=s.toCharArray();
			int count=0;
			for (char c : str) {
				if(c==' ') {
					continue;
				}
				else
				count++;
			}
			System.out.println(count);
		}
}
