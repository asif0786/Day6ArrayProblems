import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.print("Enter Number To Check : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                //System.out.print(i+"\t");
                sum+=i;
            }
        }
        if(sum==n){
            System.out.print(n+" is a Perfect Number.");
        }else {
            System.out.print("Not a Perfect Number.");
        }
//System.out.print(sum);
    }
}
