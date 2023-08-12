import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter number");
        int x = in.nextInt();
        if (x == armStrong(x))
        {
            System.out.print("your number is armstrong");
        }
        else
        {
            System.out.print("your number is not  armstrong");
        }
    }

    private static int armStrong(int x) {
     int v=0;
        while (x> 0){
            int rem = x% 10;
            v = rem*rem*rem +v;
            x=x/10;
        }
        return v;
}
}

