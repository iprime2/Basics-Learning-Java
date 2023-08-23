import java.util.Scanner;
public class ArrayMaxMin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("####### Find Max and Min in two array #######");

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter values of Array");

        for(int i=0; i < n; i++){
            System.out.print("Enter the value for index at " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = 0;

        System.out.println("Finding the Max and Min in array");
        for(int i=0; i < n; i++){

            if(arr[i] > max){
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The maximun is " + max + " and minimum is " + min);

    }
}
