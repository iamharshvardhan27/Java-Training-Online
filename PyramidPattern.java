/* 

6.
Print pyramid pattern using '*'. See example for more details.
Input Format
First and only line of input contains a single integer N - the size of the pyramid.
Constraints
1 <= N <= 50
Output Format
For the given integer, print pyramid pattern.
Input   
5
Output
    *
   ***
  *****
 *******
*********

*/

import java.util.*;
public class PyramidPattern {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
