package Ex8;

public class Magazine {
    String magazinMetro;
    String magazinNr1;
    String magazinLinella;

    Magazine () {
        magazinLinella = "[Linella]";
        magazinNr1 = "[Nr1]";
        magazinMetro = "[Metro]";
    }
    String livrare(){
        pufulet prod = new pufulet();
        camion camion = new camion();
        String livrare1 = camion.camion;
        String prodduse = prod.nume1;
        String produse1 = prod.nume2;
        return "Camionul " + livrare1 + " cu pufuletii " + produse1 + " si " + prodduse+ " au ajuns la magazinele: ";
    }
}

