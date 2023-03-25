import java.util.Scanner;

public class level258
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        int t;
        t = userIn.nextInt();

        while(t-- > 0 )
        {
            int x = userIn.nextInt();
            int open = 5;
            int total = x*open;

            System.out.println(total*2);
        }
    }
}
