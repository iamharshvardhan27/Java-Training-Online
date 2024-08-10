/* 

6.
Given a string, print count of vowels and consonants in the string.

Input Format

Input contains a string S, consisting of lowercase and uppercase characters.

Constraints

1 <= len(S) <= 100

Output Format

Print count of vowels and consonants in the given string, separated by space.

Input	
aBxbbiAasPw
Output
4 7

*/ 


import java.util.*;
public class VowelsConsonent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.toLowerCase();
        int vowelsCount = 0;
        int consonantsCount = 0;
        String vowels = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (vowels.contains(String.valueOf(ch))) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }
                System.out.println(vowelsCount + " " + consonantsCount);
    }
}