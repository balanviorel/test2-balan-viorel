import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti trei numere: ");
        int a, b, c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        if (a == b && b == c) {
            System.out.println("Numerele sunt egale");
        } else {
            System.out.println("Numerele nu sunt egale");
        }


    }
}
