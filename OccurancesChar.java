/* 

3.
Given a sentence S and a character ch, count occurrence of the given character in the sentence

Input Format

First line of input contains a sentence - S and second line of input contains a single lowercase character - ch.

Constraints

1 <= len(S) <= 100

Output Format

Print count of the given character in the sentence.

Input	
Data Structures & Algorithms
s
Output
2

*/

import java.util.*;
public class OccurancesChar{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        char ch=scanner.next().charAt(0);
        str = str.toLowerCase();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                 count++;
             }
         }
        System.out.println(ch+" in "+str); 
        System.out.print(count);
     }
}