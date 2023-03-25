import java.util.Scanner;

public class level260
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        int t;
        t = userIn.nextInt();
        while(t-- > 0)
        {
            int allowedToPlay = 6;
            int x = userIn.nextInt();


            if (x == allowedToPlay)
            {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
