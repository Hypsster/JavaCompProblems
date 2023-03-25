import java.util.Scanner;

public class problemLevel238
{


    public static void main(String[] args)
    {
        Scanner rolls = new Scanner(System.in);


        int x = rolls.nextInt();
        int y = rolls.nextInt();

        int t;
        t = rolls.nextInt();

        while (t-->0)
        if (x+y >= 6)
        {
            System.out.println("YES");
        }else
        {
            System.out.println("NO");
        }



    }
}
