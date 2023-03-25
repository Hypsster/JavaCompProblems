import java.util.Scanner;


public class level264
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        int t;
        System.out.println("How many tests would you like to run?");
        t = userIn.nextInt();


        int x = userIn.nextInt();
        int y = userIn.nextInt();
        System.out.println(x-y);
    }
}


