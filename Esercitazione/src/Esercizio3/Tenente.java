package Esercizio3;

public class Tenente extends Ufficiale {
    public Tenente() {
        super("Coordinamento operazioni di base", 3000);
    }

    @Override
    public String getGrado() {
        return "Tenente";
    }
}
