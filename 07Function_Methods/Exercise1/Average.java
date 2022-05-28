package Exercise1;

import java.util.Scanner;

public class Average {
    public static void average(int a,int b,int c) {
        int avr=(a+b+c)/3;
        System.out.println(avr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        average(a,b,c);
    }
}
