public class Ex3 {
    public static void main(String[] args) {
        int numar = 0;
        int p = 0;
        for (numar = 20; numar<=39; numar++) {
            if (numar % 2 != 0) {
                p = numar;
                System.out.println("impar   " + p);
            }
        }
    }
}
