import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int employeeSalary = input.nextInt();
       if (employeeSalary > 20000) {
           employeeSalary = employeeSalary + 1000;
       } else employeeSalary = employeeSalary + 5000;
       System.out.println(employeeSalary);
    }

}