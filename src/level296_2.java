import java.util.Scanner;
public class level296_2
{
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();
        while (t-- > 0) {
            int pages = scan.nextInt();
            int wordsOnPage = scan.nextInt();

            System.out.println(wordsOnPage*pages);
        }
    }
}
