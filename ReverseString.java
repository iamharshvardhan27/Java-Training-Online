/*

1.
Given a string, reverse the given string in-place and then print it.
Note: Do not use any inbuilt functions/libraries for your main logic.

Input Format

Input contains a string S, consisting of ascii characters.

Constraints

1 <= len(s) <= 100

Output Format

Print the reversed string.

Input - 	
fdsrd

Output -
drsdf

 */

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
           
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            left++;
            right--;
        }
        String reversedString = new String(chars);
        System.out.println(reversedString);
    }
}