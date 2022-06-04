import java.util.Scanner;


public class Strings {
    public static void main(String[] args) {
        //String Declaration
        /*String name = "Sachin";
        String fullName = "Sachin Singh";
        String sentence = "My name is Sachin Singh";*/

        /*Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Your name is :" + name);*/
        
        //concatination
        /*String firstName = "sachin";
        String lastName = "singh";
        String fullName = firstName +"@"+ lastName;
        System.out.println(fullName.length());

        //charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i)+" ");
        }*/

        //compaire
        String name1 = "sac";
        String name2 = "sac";

        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

    }
}
