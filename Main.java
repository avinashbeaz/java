
public class Main {
    public static void main(String[] args) {

        int[] arr = {23,34,56,34,65};
        int target = 34;
        System.out.println(same(arr,target));

    }

 static int same(int[] arr,int target) {
     int count = 0;
     for (int element: arr) {

         if (element == target) {
             count++;
         }
     }
     return count;

    }
}