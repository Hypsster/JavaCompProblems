import java.util.Scanner;

public class level273
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        int t = userIn.nextInt();

        while (t-- > 0 )
        {
            int hoursX = userIn.nextInt();
            int hoursY = userIn.nextInt();
            System.out.println(hoursY - hoursX);
        }
    }
}
