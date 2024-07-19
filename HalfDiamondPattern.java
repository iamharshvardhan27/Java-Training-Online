/* 

4.
Print half diamond pattern using '*'. See example for more details.
Input Format
First and only line of input contains a single integer N.
Constraints
1 <= N <= 50
Output Format
For the given integer, print the half diamond pattern.
Input   
5
Output
*
**
***
****
*****
****
***
**
*

*/

import java.util.*;
public class HalfDiamondPattern {
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
   int s = scanner.nextInt();
     for (int i = 1; i <= s; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        } 
        System.out.println();
        }
      for (int i = s - 1; i >= 1; i--) { 
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
        }
            System.out.println();
        }
    }
}
