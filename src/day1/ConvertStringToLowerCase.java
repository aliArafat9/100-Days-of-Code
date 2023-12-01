import java.util.Scanner;
public class ConvertStringToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        String result = toLower(inputString);
        System.out.println("String in lowercase: " + result);
        scanner.close();
    }
    public static String toLower(String s) {
        return s.toLowerCase();
    }
}
