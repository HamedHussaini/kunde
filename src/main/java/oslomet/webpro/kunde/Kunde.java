package oslomet.webpro.kunde;

public class Kunde {
    private String navn;
    private String addresse;

    public Kunde(String navn, String addresse){
        this.navn=navn;
        this.addresse=addresse;
    }
    public Kunde(){ }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getNavn() {
        return navn;
    }

    public String getAddresse() {
        return addresse;
    }
}
