import java.util.Scanner;

public class Task4 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.println("--- Integer Swapper (No Temp Variable) ---");
System.out.print("Enter the first integer (A): ");
        int a = scanner.nextInt();
        System.out.print("Enter the second integer (B): ");
        int b = scanner.nextInt();
System.out.println("\n--- Before Swap ---");
        System.out.println("Value of A: " + a);
        System.out.println("Value of B: " + b);
        a = a + b;
        b = a - b;
        a = a - b; 
 System.out.println("\n--- After Swap (Using Arithmetic) ---");
        System.out.println("Value of A: " + a);
        System.out.println("Value of B: " + b);
        System.out.println("-------------------------------------");

        scanner.close();
    }
}
