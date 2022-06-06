package Question;
import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int toStringSize = 0;
      String arr[] = new String[size];
      
      for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.next();
        toStringSize += arr[i].length();
      }
      System.out.println(toStringSize);
    }
}
