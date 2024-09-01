import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArtikelSokning {

    // Artikelklass som representerar en artikel
    static class Artikel {
        String titel;
        String innehall;

        public Artikel(String titel, String innehall) {
            this.titel = titel;
            this.innehall = innehall;
        }

        public String getTitel() {
            return titel;
        }

        public String getInnehall() {
            return innehall;
        }

        @Override
        public String toString() {
            return "Titel: " + titel + "\nInnehåll: " + innehall;
        }
    }

    // Metod för att söka efter en artikel baserat på titel eller innehåll
    public static List<Artikel> sokArtikel(List<Artikel> artiklar, String sokterm) {
        List<Artikel> resultat = new ArrayList<>();

        for (Artikel artikel : artiklar) {
            if (artikel.getTitel().toLowerCase().contains(sokterm.toLowerCase()) || 
                artikel.getInnehall().toLowerCase().contains(sokterm.toLowerCase())) {
                resultat.add(artikel);
            }
        }

        return resultat;
    }

    public static void main(String[] args) {
        // Exempel på artiklar
        List<Artikel> artiklar = new ArrayList<>();
        artiklar.add(new Artikel("Château Margaux 2015", "En recension av det berömda vinet Château Margaux 2015."));
        artiklar.add(new Artikel("Gruyère Ost", "En djupdykning i den distinkta smaken av Gruyère."));
        artiklar.add(new Artikel("Oliva Extra Virgin Olive Oil", "Upptäck fördelarna med denna fantastiska olivolja."));
        
        Scanner scanner = new Scanner(System.in);

        // Fråga användaren efter en sökterm
        System.out.print("Ange sökterm: ");
        String sokterm = scanner.nextLine();

        // Sök efter artiklar som matchar söktermen
        List<Artikel> resultat = sokArtikel(artiklar, sokterm);

        // Visa resultatet
        if (resultat.isEmpty()) {
            System.out.println("Inga artiklar hittades.");
        } else {
            System.out.println("Hittade artiklar:");
            for (Artikel artikel : resultat) {
                System.out.println(artikel);
                System.out.println("----------");
            }
        }

        scanner.close();
    }
}