package Esercizio2;

public class Pagina implements LibroComponent {
    private final int numeroPagine;

    public Pagina(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public void stampa() {
        System.out.println("Pagina con " + numeroPagine + " pagine.");
    }

    @Override
    public int getNumeroPagine() {
        return numeroPagine;
    }
}
