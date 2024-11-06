package Esercizio2;

public class MainEsercizio2 {
    public static void main(String[] args) {
        Pagina pagina1 = new Pagina(10);
        Pagina pagina2 = new Pagina(20);
        Pagina pagina3 = new Pagina(30);

        Sezione sezione1 = new Sezione("Introduzione");
        Sezione sezione2 = new Sezione("Capitolo 1");

        Sezione libro = new Sezione("Libro");

        sezione1.aggiungiElemento(pagina1);
        sezione1.aggiungiElemento(pagina2);

        sezione2.aggiungiElemento(pagina3);

        libro.aggiungiElemento(sezione1);
        libro.aggiungiElemento(sezione2);

        libro.stampa();
        System.out.println("Numero totale di pagine: " + libro.getNumeroPagine());
    }
}
