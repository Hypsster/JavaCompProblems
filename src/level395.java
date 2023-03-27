import java.util.Scanner;
public class level395
{
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        int t = scan.nextInt();
        while(t-->0)
        {
            int maxtravelDistance = scan.nextInt() * 5;
            int kilometersAway = scan.nextInt();
            System.out.println(maxtravelDistance>=kilometersAway ? "YES" : "NO");
        }
        scan.close();
    }
}
