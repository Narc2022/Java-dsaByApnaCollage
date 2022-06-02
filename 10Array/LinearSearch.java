import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
           System.out.println("search");
           int srh = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if(arr[i] == srh){
                System.out.println("Location :"+ i); 
            }
        }
    }
}
