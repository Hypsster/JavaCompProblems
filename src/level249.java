import java.util.Scanner;

public class level249
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        int t;
        t = userIn.nextInt();


        while(t-- >0)
        {
            int set = 15;
            int x = userIn.nextInt();

            System.out.println(x*set);
        }
    }
}
