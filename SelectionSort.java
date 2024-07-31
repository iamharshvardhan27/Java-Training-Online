/*

Implement Selection Sort and print the index which gets swapped at each step.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - size of the array. The next line contains N integers - elements of the array.

Constraints

1 <= T <= 100
2 <= N <= 100
-1000 <= ar[i] <= 1000


Output Format

For each test case, print the index which gets swapped at each step, separated by space. Separate the output of different tests by newline.

Input	
6
8
176 -272 -272 -45 269 -327 -945 176 
2
-274 161 
7
274 204 -161 481 -606 -767 -351 
2
154 -109 
4
5 3 1 5 
4
40 10 20 40

Output
4 0 4 3 1 2 1 
1 
3 0 1 2 2 1 
0 
0 0 1 
0 0 0

*/

import java.util.* ;
public class SelectionSort{
  public static void main(String args[]){
   Scanner scanner = new Scanner(System.in);
   int t = scanner.nextInt();
while(t-->0){
   int n = scanner.nextInt();
  int arr[]  = new int[n];
for(int i=0; i<n;i++){
  arr[i] = scanner.nextInt();
} 
selectionSort(arr); 
}
}
public static void selectionSort(int arr[]){
  int n = arr.length;
  int i;
  for(i=n-1; i>0;i--){
   int maxIndex = i;

   for(int j=i-1; j>=0;j--){
    if(arr[j]>=arr[maxIndex]){
      maxIndex =j;
}
}
int temp = arr[maxIndex];
arr[maxIndex]=arr[i];
arr[i] = temp;
System.out.print(maxIndex+" ");
}
System.out.println();
}
}