import java.util.Scanner;




public class problem281_2
{
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        int t = scan.nextInt(); // number of test cases

        while(t-- > 0)
        {
            int teamA = scan.nextInt();
            int teamB = scan.nextInt();

            System.out.println(teamA - teamB);
        }
    }
}
