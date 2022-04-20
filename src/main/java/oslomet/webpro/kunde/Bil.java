package oslomet.webpro.kunde;

public class Bil {
    private String merke;
    private String model;

    public Bil(String merke, String model) {
        this.merke = merke;
        this.model = model;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMerke() {
        return merke;
    }

    public String getModel() {
        return model;
    }
}
