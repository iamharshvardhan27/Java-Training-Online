/* 

5.
Print rectangle pattern. See example for more details.
Input Format
First and only line of input contains a single integer N - the size of the rectangle.
Constraints
1 <= N <= 50
Output Format
For the given integer, print rectangle pattern as shown in example.
Input   
5
Output
5432*
543*1
54*21
5*321
*4321

*/

import java.util.Scanner;
public class RectanglePattern{
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(n- j);
                }
            }
            System.out.println();
        }
    }
}
