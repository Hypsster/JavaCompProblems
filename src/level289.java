import java.util.Scanner;
public class level289
{
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args){

        int t = scan.nextInt();

        while (t-- > 0) {
            int candies = scan.nextInt();
            System.out.print(candies%3==0? "YES\n" : "NO\n");
        }
    }
}
