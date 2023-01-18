import java.util.Random;
import java.util.Scanner;

public class higherlower {
    public static void main(String args[])
    {
        Random rand = new Random();
        int secretNum = rand.nextInt(500);
        boolean truue = false;
        while (truue == false){
            System.out.println("Guess the number:");
            Scanner input = new Scanner(System.in);
            int guess = input.nextInt();
            if (guess==secretNum){
                truue = true;
            } else if (guess>secretNum) {
                System.out.println("Guess is greater than secret number");
            } else if (guess<secretNum) {
                System.out.println("Guess is less than secret number");
            }
        }
        System.out.println("The correct answer was " + secretNum);

    }
}
