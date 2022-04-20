package oslomet.webpro.kunde;

public class Kunde {
    private String navn;
    private String addresse;
    private String eierbil;
    private boolean forerkort;
    private String type;




    public Kunde(String navn, String addresse, String eierbil, boolean forerkort, String type){
        this.navn=navn;
        this.addresse=addresse;
        this.eierbil = eierbil;
        this.forerkort = forerkort;
        this.type=type;
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

    public void setEierbil(String eierbil) {
        this.eierbil = eierbil;
    }

    public String getEierbil() {
        return eierbil;
    }

    public void setForerkort(boolean forerkort) {
        this.forerkort = forerkort;
    }

    public boolean isForerkort() {
        return forerkort;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
