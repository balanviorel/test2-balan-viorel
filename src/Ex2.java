import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti un numar negativ sau pozitiv: ");
        int i = scan.nextInt();
        if (i<0){
            System.out.println("Numarul introdus: " + i + " este negativ.");
        }else{
            System.out.println("Numarul introdus: " + i + " este pozitiv.");
        }
    }
}
