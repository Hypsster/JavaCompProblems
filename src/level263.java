import java.util.Scanner;

public class level263 {
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        int t;
        t = userIn.nextInt();
        while(t-- > 0)
        {
            int patty = userIn.nextInt();
            int buns = userIn.nextInt();

            if (patty<=buns)
            {
                System.out.println(patty);
            }else{
                System.out.println(buns);
            }
        }
    }
}
