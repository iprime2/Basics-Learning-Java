import java.util.Scanner;

public class Interest_Rate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principal amount:");
        int p = sc.nextInt();
        System.out.println("Enter the Rate of Interest:");
        int r = sc.nextInt();
        System.out.println("Enter the Time period: ");
        int t = sc.nextInt();

        int si = (p*r*t)/100;
        System.out.println("Simple Interest is:" + si);
    }
}