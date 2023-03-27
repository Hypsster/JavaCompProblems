import java.util.Scanner;

public class level281
{
    private static final Scanner scan = new Scanner(System.in);
    public static void main (String[] args)
    {
        int t = scan.nextInt();

        while(t-- > 0)
        {
            int x = scan.nextInt();
            int y = scan.nextInt();


            if (x > y)
            {
                System.out.println("A");
            }
            else
            {
                System.out.println("B");
            }

        }
    }
}
