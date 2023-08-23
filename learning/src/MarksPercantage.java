import java.util.Scanner;

public class MarksPercantage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int sum = 0;
        float avg;

        System.out.println("Enter your marks of subjects out of 20");
        for(int i=0; i< marks.length; i++) {

            marks[i] = sc.nextInt();
            while(marks[i] > 20){
                System.out.println("Marks can not be greater then 20");

                marks[i] = sc.nextInt();
            }
            sum += marks[i];

        }

        avg = ((float) sum /100)*100;

        System.out.println("Your percentage is: " + avg);

    }
}
