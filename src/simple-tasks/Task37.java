/**
 * Task 37) Write a method to remove duplicate elements from an array.
 */
public class Task37 {

  public static void main(String[] args) {
  
        int[] input = {1, 3, 1, 3, 7, 9, 7, 8, 9, 9, 1, 10, 9, 10};
        java.util.Arrays.sort(input);
        int current = input[0];
        boolean same = false;
        for (int i = 0; i < input.length; i++) {
            if (current != input[i]) {
                current = input[i];
                same = false;
            }
            if (current == input[i] && !same){
                System.out.print(current + " ");
                same = true;
            }
         }
   }
}

Output = 1 3 7 8 9 10 
