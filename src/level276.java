import java.util.Scanner;

public class level276
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        int t = userIn.nextInt();

        while(t-- > 0) {
            int income = userIn.nextInt();
            int tax = 10;

            if (income > 100)
            {
                System.out.println(income-tax);
            }else{
                System.out.println(income);
            }
        }
    }
}
