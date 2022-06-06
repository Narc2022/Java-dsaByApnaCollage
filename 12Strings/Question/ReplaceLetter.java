package Question;

import java.util.Scanner;

public class ReplaceLetter {
    public static void main(String[] args) {
        /*
         Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
Example : 
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz”
 
         */

         Scanner sc = new Scanner(System.in);
         String og = sc.next();
         String result = "";

         for (int i = 0; i < og.length(); i++) {

             if(og.charAt(i)=='e'){
                 result += "i";
             } else{
                 result +=og.charAt(i);
             }
         }
        System.out.println(result);   
    }
}
