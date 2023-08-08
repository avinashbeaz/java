import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int n = input.nextInt();
         /*
           Syntax:
          for(initial value;condition;increment)
          {
             body or process
          }

          */


       for(int num = 1; num < n; num += 2) {
           System.out.println(num);
       }

       /*
           Syntax:
           initial value;
          while(condition)
          {
             body or process;
             increment;
          }

           */
        int num2 =0;
        while( num2 < 20) {
            num2 = num2 +2;
            System.out.println(num2);
        }

    }

}