import java.util.Scanner;

public class level242
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        int t;
        t = userIn.nextInt();

        while (t-- > 0 )
        {
            int x = userIn.nextInt();
            int y = userIn.nextInt();

            System.out.println(x + y);
        }
    }
}
