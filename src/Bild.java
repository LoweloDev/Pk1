public class Bild extends Medium {
    private final String ort;

    Bild(String titel, int jahr, String ort) {
        super(titel, jahr);
        this.ort = ort;
    }

    @Override
    public void druckeDaten() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ID = " + getId() + " " + getTitel() + " aufgenommen im Jahr " + getJahr() + " in " + ort ;
    }
}
