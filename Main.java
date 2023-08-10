import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d;
        do {
            System.out.println("enter first number ");
            int a = in.nextInt();
            System.out.println("enter second number ");
            int b = in.nextInt();
            System.out.println("enter 1 to add,2 to sub,3 to mul, 4 to div ");
            int c = in.nextInt();
            int e = 0;
            switch (c) {
                case 1 -> e = Calculator.sum(a, b);
                case 2 -> e = Calculator.sub(a, b);
                case 3 -> e = Calculator.mul(a, b);
                case 4 -> e = Calculator.div(a, b);
                default -> System.out.println("enter valid operations");
            }

            System.out.println(e);
            System.out.println("do you want to calculate press 0 ,press other key to exit");
            d = in.nextInt();
        } while(d==0);
    }
}