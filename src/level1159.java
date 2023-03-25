import java.util.Scanner;

public class level1159
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        int t;
        t = userIn.nextInt();
        while(t-- > 0)
        {
            String word = userIn.next();
            System.out.println(word);
            int stringLength = word.length();
            String stringSplit= word.substring(0,stringLength/2);
        }
    }
}
