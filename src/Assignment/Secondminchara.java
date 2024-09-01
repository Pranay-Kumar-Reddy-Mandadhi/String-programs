package Assignment;

import java.util.Scanner;

public class Secondminchara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        Scanner a=new Scanner(System.in);
        String s = a.next();
        int mincount =s.length();
        int secmincount = s.length() ;
        char minchar = ' ';
        char secminchar = ' ';

        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char ch1 = ch[i];
            int count = 1;
            if (ch[i] == '\u0000') continue; 
            for (int j = i + 1; j < ch.length; j++) {
                char ch2 = ch[j];
                if (ch1 == ch2) {
                    count++;
                    ch[j] = '\u0000';
                }
            }
            if (count < mincount) {
                secmincount = mincount;
                secminchar = minchar;
                mincount = count;
                minchar = ch1;
            } else if (count < secmincount && count != mincount) {
                secmincount = count;
                secminchar = ch1;
            }
        }

        if (secminchar != ' ') {
            System.out.println(secminchar + "=" + secmincount);
        } 
    }
}
