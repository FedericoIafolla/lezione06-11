package Esercizio3;

public class Maggiore extends Ufficiale {
    public Maggiore() {
        super("Pianificazione strategica", 6000);
    }

    @Override
    public String getGrado() {
        return "Maggiore";
    }
}
