import java.util.Scanner;

public class level283
{
    private static final Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        int t = scan.nextInt(); // How many test cases

        while (t-- > 0)
        {
            int fiveSeater = scan.nextInt();
            int sevenSeater = scan.nextInt();


            System.out.println(fiveSeater * 5 + sevenSeater * 7);
        }
    }
}
