package Esercizio3;

public class Colonnello extends Ufficiale {
    public Colonnello() {
        super("Gestione delle operazioni regionali", 8000);
    }

    @Override
    public String getGrado() {
        return "Colonnello";
    }
}
