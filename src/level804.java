import java.util.Scanner;

public class level804
{
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        int t = scan.nextInt();
        char[] secretWordChars;
        char[] guessWordChars;
        StringBuilder sb = new StringBuilder();
        while(t-->0)
        {
            String secretWord = scan.next();
            String guessWord = scan.next();
            secretWordChars = secretWord.toCharArray();
            guessWordChars = guessWord.toCharArray();
            sb.setLength(0);

            for (int i=0; i<secretWord.length(); i++)
            {
                if(guessWordChars[i] == secretWordChars[i]) // i Starts at 0 and stops at the secret word length. This will check all chars 0 - length
                {
                    sb.append("G");
                }else{
                    sb.append("B");
                }
            }
            System.out.print(sb+"\n");
        }
        scan.close();
    }
}
