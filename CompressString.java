/* 

8.
Given a string, compress the given string. See example for more details.

Input Format

Input contains a string S, consisting of lowercase and uppercase characters.

Constraints

1 <= len(S) <= 100

Output Format

Print the compressed string.

Inputcopy	Outputcopy
aaaBBBBhhhekkL
a3B4h3e1k2L1

*/

import java.util.Scanner;
public class CompressString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            System.out.println("");
            return;
        }
        StringBuilder compressedString = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;       
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                compressedString.append(currentChar).append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }
        compressedString.append(currentChar).append(count);
        System.out.println(compressedString.toString());
    }
}