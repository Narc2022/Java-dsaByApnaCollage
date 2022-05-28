import java.util.Scanner;

public class FactorialNumber05{
    public static void printFactorial(int a){
        if(a<0){
            System.out.println("invalid number");
            return;
        }
        int Factorial = 1;
        for(int i=a;i>=1;i--){
            Factorial= Factorial * i;
        }
        System.out.println(Factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printFactorial(a);
        
    }
}