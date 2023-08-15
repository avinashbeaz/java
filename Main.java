import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter first number");
        int a = in.nextInt();
        System.out.println("enter second number");
        int b = in.nextInt();
        System.out.println("enter third number");
        int c = in.nextInt();
        if (a > b && b > c) {
            System.out.println(a);
        } else if(b > a && b>c ){
            System.out.println(b);

        }else {
            System.out.println(c);
        }
    }
}

