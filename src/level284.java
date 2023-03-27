import java.util.Scanner;
public class level284
{
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        int totalUsers = scan.nextInt();
        int noSubmission = scan.nextInt();
        int wrongAnswers = scan.nextInt();
        int submissions = totalUsers - noSubmission;
        System.out.print(submissions + "\n" + (submissions-wrongAnswers));
    }
}