import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("####### Reversing the array #######");

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter values of Array");

        for(int i=0; i < n; i++){
            System.out.print("Enter the value for index at " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("The original array is: " + Arrays.toString(arr));


        int[] arr2 = new int[n];
        int index = 0;

        for(int i=n-1; i >= 0 ; i--){
            arr2[index] = arr[i];
            index++;
        }

        System.out.println("The reversed array is : " + Arrays.toString(arr2));

    }
}
