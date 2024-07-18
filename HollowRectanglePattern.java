/* 

3.
Print hollow rectangle pattern using '*'. See example for more details.
Input Format
Input contains two integers W - width of the rectangle and L - length of the rectangle.
Constraints
2 <= W <= 50
2 <= L <= 50
Output Format
For the given integers W and L, print the hollow rectangle pattern.
Input   
5 4
Output
*****
*   *
*   *
*****

*/

import java.util.*;
public class HollowRectanglePattern {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
  int c = scanner.nextInt();
  int r = scanner.nextInt();
  for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {      
          if (i == 0 || i == r - 1 || j == 0 || j == c - 1) {
             System.out.print('*');
           } 
          else {
                 System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
