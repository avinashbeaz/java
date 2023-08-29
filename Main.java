import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();
        char target = in.next().charAt(0);
        System.out.println(samechar(name,target));

    }

 static int samechar(String str, int target) {
        int count =0;
        if (str.length() ==0) {
            return count;
        }


     for (int i =0; i < str.length(); i++) {

         if (target == str.charAt(i)) {
             count ++;
         }
     }
     return count;

    }
}