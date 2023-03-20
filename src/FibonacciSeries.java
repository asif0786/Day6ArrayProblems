public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int temp;
        System.out.println("Fibonacci Series : ");
        System.out.print(a+"\t"+b+"\t");
        for (int i=2;i<10;i++){
            temp = a+b;
            System.out.print(temp+"\t");
            a = b;
            b = temp;
        }
    }
}
