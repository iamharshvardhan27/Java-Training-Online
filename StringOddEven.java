/* 

2.
Given a string, print all the letters present at odd index, followed by the letters present at even index.

Input Format

Input contains a string S, consisting of ascii characters.

Constraints

1 <= len(S) <= 100

Output Format

Print letters present at odd index, followed by the letters present at even index.

Input	
afdg5tg
Output
fgtad5g

*/

import java.util.*;
public class StringOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = 1; i < str.length(); i += 2) {
            System.out.print(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i += 2) {
            System.out.print(str.charAt(i));
        }
    }
}
