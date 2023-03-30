public class Main {
    public static void main(String[] args) {
        Audio audio = new Audio("Atemlos auf dem Schacht", 2200, "Helene Schiffer", 180);
        Bild bild = new Bild("Kot im Felde", 35, "Pablo Pikackso");

        audio.druckeDaten();
        bild.druckeDaten();
    }
}