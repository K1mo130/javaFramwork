public class Snack {
    private int artikelcode;
    private String naam;
    private int prijs;

    public Snack() {
    }

    public Snack(int artikelcode, String naam, int prijs) {
        this.artikelcode = artikelcode;
        this.naam = naam;
        this.prijs = prijs;
    }

    public int getArtikelcode() {
        return artikelcode;
    }

    public void setArtikelcode(int artikelcode) {
        this.artikelcode = artikelcode;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getPrijs() {
        return prijs;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }
}
