import java.util.Scanner;

public class GetUserName {

    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do{
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String userName = getNonZeroLenString(scanner, "Please enter your name");
        System.out.println("Hello, " + userName + "!");
        scanner.close();
    }
}