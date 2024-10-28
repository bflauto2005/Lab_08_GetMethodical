import java.util.Scanner;


public class FavNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int favoriteInt = getInt(scanner, "Please enter your favorite integer");
        double favoriteDouble = getDouble(scanner, "Please enter your favorite double");

        System.out.println("Your favorite integer is: " + favoriteInt);
        System.out.println("Your favorite double is: " + favoriteDouble);

        scanner.close();
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double and not " + trash);
            }
        } while (!done);

        return retVal;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do{
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer and not " + trash);
            }
        }while (!done);

        return retVal;
    }
}
