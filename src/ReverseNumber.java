import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.print("Enter Number to Reverse : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while(n != 0)
        {
            int remainder = n % 10;
            rev = rev * 10 + remainder;
            n = n/10;
        }
        System.out.println("The reverse of the given number is: " + rev);
    }
}

