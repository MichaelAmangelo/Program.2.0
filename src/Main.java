import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, c, d;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first value");
        a = scan.nextInt();
        System.out.println("Enter second value");
        b = scan.nextInt();
        System.out.println("Enter thrid value");
        c = scan.nextInt();
        System.out.println("Enter fourth value");
        d = scan.nextInt();

        System.out.println(sum(a, b, c, d));

        System.out.println(multiply(a, b, d));

        System.out.println(divide(b, d));

        System.out.println(subtract(b, c));

    }

    public static int subtract(int b, int c) {

        int total = b - c;
        return total;
    }

    public static double divide(double b, double d) {

        double total = b / d;
        return total;
    }

    public static int multiply(int a, int b, int d) {

        int total = a * b * d;
        return total;
    }

    public static int sum(int a, int b, int c, int d) {

        int total = a + b + c + d;
        return total;
    }
}















