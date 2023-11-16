import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char menu='y';
        do{
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do{
                System.out.print("Number Guessing (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);
            }while(!success);
            System.out.print("Do you want to restart the game? (Y/y): ");
            menu = input.nextLine().charAt(0);
        }while(menu=='y'|| menu=='Y');

    }
}
