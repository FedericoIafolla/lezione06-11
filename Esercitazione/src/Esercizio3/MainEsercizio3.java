package Esercizio3;

public class MainEsercizio3 {
    public static void main(String[] args) {
        Tenente tenente = new Tenente();
        Capitano capitano = new Capitano();
        Maggiore maggiore = new Maggiore();
        Colonnello colonnello = new Colonnello();
        Generale generale = new Generale();
        
        tenente.setResponsabile(capitano);
        capitano.setResponsabile(maggiore);
        maggiore.setResponsabile(colonnello);
        colonnello.setResponsabile(generale);

        tenente.stampaInfo();
        capitano.stampaInfo();
        maggiore.stampaInfo();
        colonnello.stampaInfo();
        generale.stampaInfo();
    }
}
