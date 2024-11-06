package Esercizio3;

public abstract class Ufficiale {
    protected String funzione;
    protected double stipendio;
    protected Ufficiale responsabile;

    public Ufficiale(String funzione, double stipendio) {
        this.funzione = funzione;
        this.stipendio = stipendio;
    }

    public void setResponsabile(Ufficiale responsabile) {
        this.responsabile = responsabile;
    }

    public abstract String getGrado();

    public void stampaInfo() {
        System.out.println("Grado: " + getGrado());
        System.out.println("Funzione: " + funzione);
        System.out.println("Stipendio: " + stipendio + "€");
        if (responsabile != null) {
            System.out.println("Responsabile: " + responsabile.getGrado());
        } else {
            System.out.println("Questo ufficiale non ha responsabile.");
        }
    }
}
