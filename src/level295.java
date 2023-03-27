import java.util.Scanner;
public class level295
{
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        int t = scan.nextInt();
        while(t-->0)
        {
            int amountReceived = scan.nextInt();
            System.out.println(amountReceived%2==0 ? "YES" : "NO"); // Can they be divided equally?
        }
    }
}
