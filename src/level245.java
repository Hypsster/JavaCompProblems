import java.util.Scanner;

public class level245
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        int t;
        t = userIn.nextInt();

        while(t-- > 0)
        {
            int x = userIn.nextInt();
            int y = userIn.nextInt();
            int A = userIn.nextInt();

            if (A >= x && A < y)
            {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
