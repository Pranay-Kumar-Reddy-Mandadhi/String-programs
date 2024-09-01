package Assignment;

public class removedupwordsch {
	public static void main(String[] args) {
        String input = "happy happy birthday ";
        String output = removeDuplicates(input);
        System.out.println(output);
    }
    public static String removeDuplicates(String input) {
        char[] inputChars = input.toCharArray();
        int n = inputChars.length;
        char[] result = new char[n];
        int resultIndex = 0;
        int wordStart = 0;
        int wordEnd = 0;
        while (wordStart < n) {
            while (wordEnd < n && inputChars[wordEnd] != ' ') {
                wordEnd++;
            }
            if (!isWordInResult(result, resultIndex, inputChars, wordStart, wordEnd)) {
                if (resultIndex > 0) {
                    result[resultIndex++] = ' ';
                }
                for (int i = wordStart; i < wordEnd; i++) {
                    result[resultIndex++] = inputChars[i];
                }
            }
            wordEnd++;
            wordStart = wordEnd;
        }
        return new String(result, 0, resultIndex);
    }
    private static boolean isWordInResult(char[] result, int resultLength, char[] word, int wordStart, int wordEnd) {
        int wordLength = wordEnd - wordStart;

        int i = 0;
        while (i <= resultLength - wordLength) {
            boolean match = true;
            for (int j = 0; j < wordLength; j++) {
                if (result[i + j] != word[wordStart + j]) {
                	System.out.println(result);
                    match = false;
                    break;
                }
            }
            if (match && (i + wordLength == resultLength || result[i + wordLength] == ' ')) {
                return true;
            }
            while (i < resultLength && result[i] != ' ') {
                i++;
            }
            i++; 
        }

        return false;
    }   
}
