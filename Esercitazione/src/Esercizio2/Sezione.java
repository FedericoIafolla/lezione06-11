package Esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements LibroComponent {
    private final String titolo;
    private final List<LibroComponent> elementi;

    public Sezione(String titolo) {
        this.titolo = titolo;
        this.elementi = new ArrayList<>();
    }

    public void aggiungiElemento(LibroComponent elemento) {
        elementi.add(elemento);
    }

    @Override
    public void stampa() {
        System.out.println("Sezione: " + titolo);
        for (LibroComponent elemento : elementi) {
            elemento.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
        return elementi.stream().mapToInt(LibroComponent::getNumeroPagine).sum();
    }
}
