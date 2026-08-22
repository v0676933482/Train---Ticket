package application;


public class TeDhenat {
    private String emri;
    private String mbiemri;
    private String email;
    private String telefon;
    private String gjinia;
    private Zgjedhje zgjedhja; // Klase për të mbajtur zgjedhjen e rreshtit të tabeles

    // Konstruktori
    public TeDhenat(String emri, String mbiemri, String email, String telefon, String gjinia, Zgjedhje zgjedhja) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.email = email;
        this.telefon = telefon;
        this.gjinia = gjinia;
        this.zgjedhja = zgjedhja;
    }

    // Metodat për të marrë vlerat
    public String getEmri() {
        return emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getGjinia() {
        return gjinia;
    }

    public Zgjedhje getZgjedhja() {
        return zgjedhja;
    }
}
