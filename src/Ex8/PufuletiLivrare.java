package Ex8;

public class PufuletiLivrare {
    public static void main(String[] args) {
        System.out.println("Fabrica produce pufuleti. ");
        System.out.print("Fabrica a produs pufuleti: ");
        pufulet puf = new pufulet();
        String productie = puf.productie();
        System.out.println(productie);

        camion truck = new camion();
        String incarcare = truck.incarcare();
        System.out.println(incarcare);

        Magazine livrare = new Magazine();
        String livraremag = livrare.livrare();
        String mag1 = livrare.magazinNr1;
        String mag2 = livrare.magazinLinella;
        String mag3 = livrare.magazinMetro;
        System.out.println(livraremag + mag1 + " , " + mag2 + " si " + mag3);
    }
}

