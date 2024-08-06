/*

5.
Given a string, check if it contains only digits.

Input Format

Input contains a string S, consisting of ascii characters.

Constraints

1 <= len(S) <= 100

Output Format

Print "Yes" if string contains only digits, "No" otherwise.

Input	
123456786543

Output
Yes

Input	
"Smart-Interviews"

Output
No

*/

import java.util.*;
public class DigitStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if('0'<=str.charAt(i)&&str.charAt(i)<='9'){
                count++;
            }
        }
        if(count==str.length()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}