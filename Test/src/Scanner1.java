import java.util.*;

public class Scanner1 {
   public static final Scanner CONSOLE = new Scanner(System.in);
   
   public static void main(String[] args) {
      System.out.println("Enter the first integer");
      int value1 = CONSOLE.nextInt();
      System.out.println("The first value was "+value1);
      showSecondValue("Enter the second integer");
   }
   
   public static void showSecondValue(String prompt) {
      System.out.println(prompt);
      int value2 = CONSOLE.nextInt();
      System.out.println("The second value was "+value2);
   }
   
}