import java.util.Scanner;

public class Task3 {
 public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("--- Celsius to Fahrenheit Converter ---");
System.out.print("Enter the temperature in Celsius (°C): ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        System.out.printf("\nTemperature in Celsius: %.2f °C\n", celsius);
        System.out.printf("Temperature in Fahrenheit: %.2f °F\n", fahrenheit);
        System.out.println("-------------------------------------");

        scanner.close();
    }
}
