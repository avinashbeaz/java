import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int employeeAge = input.nextInt();
       if (employeeAge > 60) {
           System.out.println("you are retired");
       } else if (employeeAge >20) {
           System.out.println("good luck for your job , you have " + (60 -employeeAge) + "years left  to retire");
       } else System.out.println("you are too young to do this job");

    }

}