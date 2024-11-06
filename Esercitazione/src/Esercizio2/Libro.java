package Esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private final List<String> autori;
    private final double prezzo;
    private final List<LibroComponent> contenuti;

    public Libro(List<String> autori, double prezzo) {
        this.autori = autori;
        this.prezzo = prezzo;
        this.contenuti = new ArrayList<>();
    }

    public void aggiungiContenuto(LibroComponent contenuto) {
        contenuti.add(contenuto);
    }

    public void stampaLibro() {
        for (LibroComponent contenuto : contenuti) {
            contenuto.stampa();
        }
    }

    public int getNumeroTotalePagine() {
        return contenuti.stream().mapToInt(LibroComponent::getNumeroPagine).sum();
    }
}
