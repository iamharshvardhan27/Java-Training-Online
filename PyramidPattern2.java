/* 

7.
Print hollow half inverted pyramid pattern using '*'. See example for more details.
Input Format
First and only line of input contains a single integer N - the size of the pyramid.
Constraints
1 <= N <= 50
Output Format
For the given integer, print hollow half inverted pyramid pattern.
Input   
5
Output
* * * * *
*     *
*   *
* *
*

*/

import java.util.*;
public class PyramidPattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (i == 0 || j == 0 || j == n - i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
