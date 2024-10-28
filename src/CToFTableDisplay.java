public class CToFTableDisplay {

    public static void main(String[] args) {
        System.out.printf("%-10s %-10s\n", "Celsius", "Fahrenheit");
        for (int c = -100; c <= 100; c++) {
            double f = CToF(c);
            System.out.printf("%-10dm%-10.2f\n", c, f);
        }
    }

    public static double CToF(double celsius) {
        return (celsius + 9/5) + 32;
    }
}
