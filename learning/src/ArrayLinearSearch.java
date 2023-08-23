import java.util.Scanner;

public class ArrayLinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array:");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter your value to array.");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            while(arr[i] > 100) {
                System.out.println("Marks can not be greater then 100");
                arr[i] = sc.nextInt();
            }
        }

        int ans = -1;
        System.out.print("Which value you want to search:");
        int key = sc.nextInt();
        while(key > 100) {
            System.out.println("Value can not be greater then 100");
            key = sc.nextInt();
        }

        int index = 0;
        for(int j = 0; j < n; ++j) {
            if(arr[j] == key){
                ans = key;
                index  = j;
                break;
            }
        }

        if(ans > 0 ){
            System.out.println("The value " + ans + " is present in array at index " + index );
        }else{
            System.out.println("The value " + key + " is not present in array." );
        }

    }
}
