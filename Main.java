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
        System.out.println("max number is :" +max(a,b,c)); System.out.println("min mber is :" +min(a,b,c));
    }
    static int max(int a, int b , int c) {
        int max;
        if (a > b && b > c) {
           max = a;
        } else if(b > a && b>c ){
            max = b;

        }else {
         max = c;
        }
        return max;
    }
    static int min(int a, int b , int c) {
        int min;
        if (a < b && b < c) {
            min = a;
        } else if(b < a && b<c ){
            min = b;

        }else {
            min = c;
        }
        return min;
    }
}
