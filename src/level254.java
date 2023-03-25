import java.util.Scanner;

public class level254 {
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        int t;
        t = userIn.nextInt();

        while(t-- > 0)
        {
            int rec = 2000;
            int x = userIn.nextInt();

            if ( x >= rec)
            {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
