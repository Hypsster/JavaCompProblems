import java.util.Scanner;
public class level296_3 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        int t = scan.nextInt();
        while(t-->0)
        {
            int batteryHealth = scan.nextInt();
            System.out.println(batteryHealth >= 80 ? "YES" : "NO");
        }
    }
}
