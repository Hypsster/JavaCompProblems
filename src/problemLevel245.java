import java.util.Scanner;

public class problemLevel245
{
    public static void main(String[] arga)
    {
        Scanner userIn = new Scanner(System.in);


        int min = 16;
        int max = 21;

        System.out.println("Howe many test do you want to run?");
        int t = userIn.nextInt();

        while(t > 0)
        {

            System.out.println("Enter your age: ");
            int age = userIn.nextInt();

            if (age > max)
            {
                System.out.println("NO");
            } else if (age < min)
            {
                System.out.println("NO");
            }else
            {
                System.out.println("YES");
            }
            t--;
        }
    }
}
