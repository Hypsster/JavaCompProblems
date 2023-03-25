import java.util.Random;
import java.util.Scanner;
import java.lang.StringBuilder;

class level804
{
    public static void main(String[] args) {

        StringBuilder playTimeText = new StringBuilder("You choose to play ");
        Scanner userIn = new Scanner(System.in);
        System.out.println("How many times would you like to play?");
        int t = userIn.nextInt();
        if (t <= 1)
        {
            System.out.println(playTimeText.append(t + " Game"));
        }
        else
        {
            System.out.println(playTimeText.append(t + " Games"));
        }
        int guesses = 4;

        while(t-- > 0) // Amount of games to play every 5 guesses.
        {
            System.out.println("Enter a secret word: ");
            String secretWord = userIn.next();


            while (guesses-- > 0) // Chances to guess
            {
                System.out.println("You have " + t + " rounds remaining.");
                System.out.println("Enter your secret word guess: ");
                String guess = userIn.next();
                int index = secretWord.indexOf(guess);




                if (guess.equals(secretWord))
                {
                    System.out.println("You guessed correctly, Good Job!");
                    break;
                }
                if (guess.length() > secretWord.length())
                {
                    System.out.println("The word you guessed is too long, try a shorter word");
                } else if (guess.length() == secretWord.length())
                {
                    System.out.println("You have the right amount of letters but the wrong word.");
                } else
                {
                    System.out.println("The word you guessed is too short, try a longer word");
                }

            }

        }
    }
}