import java.util.Scanner;

class level279_2
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        int t = userIn.nextInt();
        while(t-- > 0)
        {
            int tTime = 30;
            int leftEarly = userIn.nextInt();

            if (leftEarly >= tTime)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("NO");
            }


        }
    }
}