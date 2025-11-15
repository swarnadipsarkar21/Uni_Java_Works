import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the score of first Student : ");
        int score1 = scanner.nextInt();
        System.out.println("Enter the score of second Student : ");
        int score2 = scanner.nextInt();
        System.out.println("Enter the score of third student : ");
        int score3 = scanner.nextInt();
        double average = (score1 + score2 + score3) / 3.0;
        System.out.println("The average score of the three student is : " + average);
        scanner.close();
        

    }
    
}
