import java.util.Scanner;

public class Basics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//
//        int y = x * x;
//        System.out.println(y);

        // sc.next() only print string till whitespace
        // I have used sc.nextLine()
        // String str = sc.nextLine();
//        System.out.println(str);

        // this helps to read single character
        char c = sc.next().charAt(0);
        System.out.println(c);

    }
}
