import java.util.Arrays;
import java.util.Scanner;

public class ArraySquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("####### Generating Squares of array #######");

        System.out.print("Enter the size of array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter values of Array");

        for(int i=0; i < n1; i++){;
            int a = (i + 1) * (i + 1);
            arr1[i] = a;
        }

        System.out.println("The array with square values : " + Arrays.toString(arr1));

//        System.out.println("The original Array is: " + Arrays.toString(arr1));
//
//        int[] arr2 = new int[n1];
//
//        for(int i=0; i < n1; i++){
//            arr2[i] = arr1[i] * arr1[i];
//        }
//
//
//        System.out.println("The new array with square of previous array is: " + Arrays.toString(arr2));
    }
}
