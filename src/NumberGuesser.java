import java.util.Scanner;

/**
 *  Game: NumberGuesser
 *  Goal: One person assigns a secret number b/w 1 and 100
 *        Another person guesses the secret number.
 *        You have seven guesses
 * 
 * Example: Number 8 Guess 7 -> Wrong
 *          Life: 7-1 = 6        
 * 
 * 
 */
public class NumberGuesser{
    public static void main(String[] args){
        String playAgain = "yes";
        while (playAgain.equals("yes")){
            @SuppressWarnings("resource")
            Scanner input = new Scanner(System.in);

            int lives = 7;

             //test please
            System.out.println("The number to be guessed must be b/w 0 & 100");
            System.out.print("Please enter a number to be guessed: ");
            int number = input.nextInt();

            // Loops until condition is true
            while (checkNum(number, input) == false){
                System.out.print("Please enter a number within range: ");
                number = input.nextInt();
            }

            // Loops until lives = 0 
            while (lives > 0) {
                System.out.println("Lives left:" + lives);
                System.out.println("Guess a number:");
                int guess = input.nextInt();

                if (guess > number){
                    lives--;
                } else if (guess < number){
                    lives--;
                } else if (guess == number) {
                    System.out.println("You win!");
                    break;
                }
                if (lives == 0){
                    System.out.println("You lose!");
                }
                }

            System.out.println("Wanna try again?");
            playAgain = input.next().toLowerCase();
            if (playAgain.equals("yes") == false){
                System.out.println("Thanks for playing!");
            }
        }
    }
    

    /**
     * Checks for range b/w 0-100
     * 
     * @param number
     * @param input
     * @return false if not in range, true if in range
     */

    private static boolean checkNum(int number, Scanner input){
        if ((number > 100) || (number < 1)){
            return false;
            } 
        return true;
    }
}