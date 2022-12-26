import java.util.Arrays;
import java.util.Scanner;

/*
In this section we will see how to find and print the smallest and largest element in array.
______________________________________________________________________________________________
Question : find the smallest and the largest element in array.
____________________________________________________________________
Approach : first we take input from user and then compare the element with each other and then separate largest and
           smallest element and print it
 */
public class Main {
    static int[] CompareLargestOrSmaller(int arr[]){
        Arrays.sort(arr);
        int [] ans = {arr[0] , arr[arr.length - 1]};
                return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the value you want to store in array :" + a);
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.println("First we were printing the value of array : " + arr[i]);
        }
        int an [] = CompareLargestOrSmaller(arr);
        System.out.println("printing the smallest number : " + an[0]);
        System.out.println("printing the largest number :  " + an[1]);
    }
}