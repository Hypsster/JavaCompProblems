import java.util.Scanner;

public class level238 {


    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner userIn = new Scanner(System.in);
        int t;
        t = userIn.nextInt();

        while (t-- > 0)
        {
            int x = userIn.nextInt();
            int y = userIn.nextInt();

            if (x+y > 6)
            {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}