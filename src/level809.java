import java.util.Scanner;
public class level809
{
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        int t = scan.nextInt();
        while (t-->0)
        {
            int n = scan.nextInt();
            System.out.println(n%4==2 ? "YES" : "NO");
        }
        scan.close();
    }
}
