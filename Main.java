import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter random number");
        int n = input.nextInt();
        System.out.println("enter digit to find occurrences");
        int m = input.nextInt();
        int count = 0;
        while (n > 0){
            int rem = n % 10;
            if (rem == m) {
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}