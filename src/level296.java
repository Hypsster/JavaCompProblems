import java.util.Scanner;
public class level296 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        int t =scan.nextInt();
        for(int i =0; i < t; i++)
        {
            int x = scan.nextInt();
            int y = scan.nextInt();

            System.out.println(10 * x + 90 * y);
        }
    }
}