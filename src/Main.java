import java.util.Scanner;


public class Main {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any word or string of letters: ");
        String string = scanner.nextLine();


        String reverse="";


        for (int i = string.length()-1; i>=0; i--)
        {
            reverse = reverse + string.charAt(i);
        }

        System.out.println("Reversed string is " + "\t" + reverse);

    }

}
