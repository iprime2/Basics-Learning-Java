import java.util.Scanner;

public class CommonValueArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("####### Find common value in two array #######");

        System.out.print("Enter the size of 1st array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter values of 1st Array");

        for(int i=0; i < n1; i++){
            System.out.print("Enter the value for index at " + (i+1) + ": ");
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of 2nd array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter values of 2nd Array");

        for(int i=0; i < n2; i++){
            System.out.print("Enter the value for index at " + (i+1) + ": ");
            arr2[i] = sc.nextInt();
        }

        System.out.println("Generating new array with common values");

        int n3 = 0;
        int[] arr3 = new int[Math.min(n1, n2)];

        for(int i=0; i < n1; i++){
            for(int j=0; j < n2; j++){
                if(arr1[i] == arr2[j]){
                    arr3[n3] = (arr1[i]);
                    n3++;
                }
            }
        }

        if(arr3.length > 0){
            System.out.println("Printing the array with common values");
            for(int i=0; i < arr3.length; i++){
                System.out.print(arr3[i] + " ");
            }
        }else{
            System.out.println("There is no common value in two arrays");
        }



    }
}
