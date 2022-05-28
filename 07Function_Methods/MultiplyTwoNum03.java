import java.util.Scanner;

public class MultiplyTwoNum03 {
    public static int multiply(int a,int b) {
       int multi=a*b;
       return multi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multi=multiply(a, b);
        System.out.println(multi);
    }
}
 