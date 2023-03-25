import java.lang.StringBuilder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class testFile
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String secretWord = "dog";
        int t = 1;


        while (t-- > 0)
        {
            int wordLength = secretWord.length();
            for (int i = 0; i < wordLength; i++)
            {
                String guess = in.next();
                int index = secretWord.indexOf(guess);
                System.out.println(index+1);
            }


        }
    }
}
