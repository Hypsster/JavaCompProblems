import java.util.Scanner;

public class level267
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        int t = userIn.nextInt();
        while(t-- > 0)
        {
            int x = userIn.nextInt(); //total points
            int y = userIn.nextInt(); //No. of test cases

            int eachTestPoint = x/10;
            int score = eachTestPoint*y;
            System.out.println(score);
        }
    }
}
