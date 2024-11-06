package Esercizio3;

public class Capitano extends Ufficiale {
    public Capitano() {
        super("Supervisione delle squadre", 4500);
    }

    @Override
    public String getGrado() {
        return "Capitano";
    }
}
