/*

4.
Given a string, check if it contains only vowels.

Input Format

Input contains a string S, consisting of lowercase and uppercase characters.

Constraints

1 <= len(S) <= 100

Output Format

Print "Yes" if string contains only vowels, "No" Otherwise.

Input 	
SmartInterviews

Output
No

*/

import java.util.*;
public class VowelsString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean Vowels = input.matches("[AEIOUaeiou]+");
        if (Vowels) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }   
    }
}