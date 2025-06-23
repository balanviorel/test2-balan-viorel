package Ex8;

public class camion {
    String camion;

    camion() {
        camion = "[Camion]";

    }

    String incarcare() {
        pufulet prod = new pufulet();
        String incarcare1 = prod.nume1;
        String incarcare2 = prod.nume2;
        return "Pufuletii " + incarcare1 + " si " + incarcare2 + " sunt incarcati in " + camion;

    }
}