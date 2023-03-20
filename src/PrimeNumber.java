import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter Range To Check for Prime Numbers : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Prime Numbers are : 2 3 ");
        for(int i=3;i<=n;i++){
            if(i % 2 != 0 && i % 3 != 0){
                System.out.print(i+" ");
            }
        }
    }
}
