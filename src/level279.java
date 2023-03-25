import java.util.Scanner;


class level279
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        int t = userIn.nextInt();
        while (t--> 0 )
        {
            int x = userIn.nextInt();

            if (x >= 67 && x <= 45000)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}