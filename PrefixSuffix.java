/* 
9.
Given a string, compute the length of longest proper prefix which is same as the suffix of the given string.

Input Format

Input contains a string S, consisting of only lowercase characters.

Constraints

1 <= len(S) <= 100

Output Format

Print length of longest proper prefix which is same as suffix of the given string.

Input	
smartintsmart

Output
5

*/

import java.util.*;
public class PrefixSuffix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        System.out.println(longestPrefixSuffix(s));
    }
    public static int longestPrefixSuffix(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int length = 0;
        for (int i = 1; i < n; i++) {
            while (length > 0 && s.charAt(i) != s.charAt(length)) {
                length = lps[length - 1];
            }
            if (s.charAt(i) == s.charAt(length)) {
                length++;
            }
            lps[i] = length;
        }
        return lps[n - 1];
        sc.close();
    }
}