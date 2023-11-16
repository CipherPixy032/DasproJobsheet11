import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Guess a number (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);
                if (answer > number) {
                    System.out.println("Too high");
                } else if (answer < number) {
                    System.out.println("Too low");
                } else {
                    System.out.println("Congrats!!!");
                }
            } while (!success);
            System.out.print("Do you want to retry the game? (y/n): ");
            menu = input.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');
    }
}
