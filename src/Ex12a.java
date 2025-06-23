public class Ex12a extends Ex12 {
    public static void main(String[] args) {
        int c;
        Ex12 acces = new Ex12();

        acces.setB(12);
        acces.a(11);

        c = acces.a + acces.getB();
        System.out.println(c);
    }
}
