public class Print1to5 {
    public static void printNumber1(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printNumber1(1+n);
        
    }
    public static void main(String[] args) {
        printNumber1(1);
    }
}
