import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter engine cc");
        int engine = input.nextInt();
       /*
       switch syntax:
       switch (expression) {
       case one:
         //do something
         break;
          case two:
         //do something
         break;
         default:
         //do something
         }

        */
        switch (engine) {
            case 150 -> System.out.println("you have good mileage");
            case 200 -> System.out.println("you have decent pickup");
            case 390 -> System.out.println("the ktm dude");
            case 1000 -> System.out.println("i can hear you from far away");
            default -> System.out.println("don't try to be smart enter details correctly");
        }
    }
}