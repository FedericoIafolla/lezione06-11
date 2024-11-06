package Esercizio3;

public class Generale extends Ufficiale {
    public Generale() {
        super("Comando generale e decisioni strategiche", 10000);
    }

    @Override
    public String getGrado() {
        return "Generale";
    }
}
