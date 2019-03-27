//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class countNumberOfOccurrencesOfCharInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        //Enter a string
        String str;
        System.out.println("Enter a string : ");
        str = scanner.nextLine();
        //Enter a char
        char character = 'a';
        int count = 0;
//        System.out.println("Enter a Character:");
//        character = System.in.read();
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == character){
                count++;
            }
        }
        // Show count
        System.out.println("In the String, has "+ count+ " character "+ character);
    }
}
