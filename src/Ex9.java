import java.util.Scanner;

public class Ex9 {
    double latime;
    double inaltime;


    Ex9() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introducem lungimea laturii: ");

        latime = scan.nextInt();
        inaltime = scan.nextInt();
    }
    double perimetru() {
        return latime*inaltime;
    }
    public static void main(String[] args) {
        Ex9 per = new Ex9();
        double perimetru;
        perimetru = per.perimetru();

        System.out.println("Perimetrul este: " + perimetru);
    }

}
