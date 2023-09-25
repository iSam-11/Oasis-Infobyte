import java.util.Random;
import java.util.Scanner;

public class number_guessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        int maxAttempts = 10; 
        int attempts = 0;
        
        System.out.println("Welcome to the Guessing the Number game ");
        System.out.println("I haver selected a random number between " + lowerBound + " and " + upperBound);
        System.out.println("Can you guess it in " + maxAttempts + " attempts?");
        
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int Guess = scanner.nextInt();
            
            if (Guess == secretNumber) {
                System.out.println("Congratulations! You have  guessed the number: " + secretNumber);
                break;
            } else if (Guess < secretNumber) {
                System.out.println("Try a larger  number.");
            } else {
                System.out.println("Try a smaller number.");
            }
            
            attempts++;
            int remainingAttempts = maxAttempts - attempts;
            System.out.println("Remaining attempts: " + remainingAttempts);
        }
        
        if (attempts == maxAttempts) {
            System.out.println("Sorry, you have run out of attempts.");
            System.out.println("The secret number was: " + secretNumber);
        }
        
        System.out.println("Thanks for playing");
        scanner.close();
    }
}
