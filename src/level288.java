import java.util.Scanner;
public class level288
{
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int threshHold = scan.nextInt();
        int workSpeed = scan.nextInt();

        System.out.print(workSpeed > threshHold ? "YES" : "NO");
    }
}
