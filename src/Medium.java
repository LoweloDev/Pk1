import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

public abstract class Medium {
    private int id = Id.next();
    private String titel;
    private int jahr;
    Medium(String titel, int jahr){
        this.titel = titel;
        this.jahr = jahr;
    }

    public int alter() {
        LocalDate date = LocalDate.now();

        return date.getYear() - jahr;
    }

    public int getId() {
        return this.id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public abstract void druckeDaten();
}
