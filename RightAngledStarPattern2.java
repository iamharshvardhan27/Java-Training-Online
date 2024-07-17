/* 
2.
Print right-angled triangle pattern. See example for more details.
Input Format
First line of input contains a single integer N - the size of the triangle.
Constraints
1 <= N <= 50
Output Format
For the given integer, print the right-angled triangle pattern.
Input   
5
Output
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
*/


import java.util.Scanner;
public class RightAngledStarPattern2{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 1; i <= n; i++) {
        int num = i;
        int diff=n-1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num=num+diff;
                diff--;
            }
        System.out.println();
        }
    }
}

