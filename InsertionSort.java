/* 

Implement Insertion Sort and print the index at which the ith element gets inserted [i>=1].

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - size of the array. The next line contains N integers - elements of the array.

Constraints

1 <= T <= 100
2 <= N <= 100
-1000 <= ar[i] <= 1000

Output Format

For each test case, print the index at which the ith element gets inserted [i>=1], separated by space. Separate the output of different tests by newline.

Input	
4
8
176 -272 -272 -45 269 -327 -945 176 
2
-274 161
7
274 204 -161 481 -606 -767 -351
2
154 -109

Output
0 1 2 4 0 0 6 
1 
0 0 3 0 0 2 
0

*/

import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); 
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            printInsertionIndexes(arr);
        }
    }

    private static void printInsertionIndexes(int[] arr) {
        int N = arr.length;
        int[] indexes = new int[N - 1];
        
        for (int i = 1; i < N; i++) {
            int key = arr[i];
            int j = i - 1;

        
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
    
            indexes[i - 1] = j + 1;
            arr[j + 1] = key;
        }

        for (int i = 0; i < indexes.length; i++) {
            System.out.print(indexes[i] + " ");
        }
        System.out.println();
    }
}
