import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter random number");
        int n = input.nextInt();
        int m =0;
        while (n > 0){
            int rem = n % 10;
            n=n/10;
            m = m*10 + rem;
        }
        System.out.println(m);

    }
}