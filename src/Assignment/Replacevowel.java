package Assignment;
public class Replacevowel {
    public static void main(String[] args) {
        String exampleString = "Pranay Kumar Reddy";
        String result = replace(exampleString);
        System.out.println(result); 
        }

    public static String replace(String input) {
        String vowels = "aeiouAEIOU";
        int vowelCount = 0;
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
                vowelCount++;
            }
        }
        	if (vowelCount > 2) {
            for (int i = 0; i < chars.length; i++) {
                if (vowels.indexOf(chars[i]) != -1) {
                    chars[i] = ' ';
                }
            }
        }

        return new String(chars);
    }
}
