/*

7.
Given a string, toggle the case of each character in the given string.

Input Format

Input contains a string S, consisting of lowercase and uppercase characters.

Constraints

1 <= len(S) <= 100

Output Format

Print the toggled string.

Input	
abdBd

Output
ABDbD

*/

import java.util.*; 
public class ToggleChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        String str = scanner.nextLine(); 
        StringBuilder toggledString = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggledString.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggledString.append(Character.toUpperCase(ch));
            } else {
                toggledString.append(ch);
            }
        }       
        System.out.println(toggledString.toString());  
    }
}