package Assignment;

import java.util.Scanner;

public class Trimwithoutmethod {
	public static void main(String[] args) {
	        String str = "         Pranay          kumar      reddy";
	        char[] ch = str.toCharArray();
	        int start =0;
	        while (start < ch.length && ch[start] == ' ') {
	            start++;
	        }
	        int end = ch.length - 1;
	        while (end >= 0 && ch[end] == ' ') {
	            end--;
	        }
	        String result = "";
	        boolean inSpace = false;
	        for (int i = start; i <= end; i++) {
	            if (ch[i] != ' ') {
	                result += ch[i];
	                inSpace = false;
	            } else if (!inSpace) {
	                result += ' ';
	                inSpace = true;
	            }
	        }
	        
	        System.out.println(result);
	    }
}
