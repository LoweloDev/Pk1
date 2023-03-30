public class Audio extends Medium {
    private final String interpret;

    private final int dauer;

    Audio(String titel, int jahr, String interpret, int dauer) {
        super(titel, jahr);
        this.interpret = interpret;
        this.dauer = dauer;
    }

    @Override
    public void druckeDaten() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ID = " + getId() + " " + getTitel() + " von " + interpret + " aus " + getJahr() + " Spieldauer: " + dauer + " sek.";
    }
}
