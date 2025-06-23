public class ex9A {
    public static double patrulater(double x) {
        return x*x;
    }
}

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Introduceti lungime laturei patrulaterului: ");
    double lungime = scan.nextDouble();
    double perimetru = ex9A.patrulater(lungime);
    System.out.println("Perimetrul patrulaterului este: " + perimetru);

}
