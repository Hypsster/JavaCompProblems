import java.util.Scanner;

public class level294
{
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        int t = scan.nextInt();
        while(t-- > 0)
        {
            int chefsMoney = scan.nextInt();
            int bill = scan.nextInt();

            System.out.println(chefsMoney < bill ? "NO" : "YES");
        }
    }
}
