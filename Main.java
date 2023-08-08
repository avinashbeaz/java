import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3;
        if (n < 2 ) {
            System.out.println("your fibonacci number is 0");
        } else if (n < 3) {
            System.out.println("your fibonacci number is 1");
        } else {
            for (int a = 0; a <= n-1; a++) {

                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
            }
            System.out.println("nth fibonacci number is : " + num1);

        }
    }
}