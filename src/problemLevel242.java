import java.util.Scanner;

public class problemLevel242 {

    public static void main(String[] args)
    {
        Scanner readIn = new Scanner(System.in);


        int T = readIn.nextInt();
        int x = readIn.nextInt();
        int y = readIn.nextInt();


        while (T-- > 0) // While t is greater than 0
        {

            System.out.println(x + y);
        }
    }
}
