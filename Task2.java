import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the original price of the item : ");
         double OriginalPrice = scanner.nextDouble();
         System.out.println("Enter the discount amount (in percentage) :");
         double DiscountPercent = scanner.nextDouble();
         double DiscountPrice = (DiscountPercent/100) * OriginalPrice;
         double FinalPrice = OriginalPrice - DiscountPrice;
         System.out.println("The final price after discount is : " + FinalPrice);
         scanner.close();
         


    }
    
}
