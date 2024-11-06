package Esercizio1;

public class MainEsercizio1 {
    public static void main(String[] args) {
        Info info = new Info();
        info.setNome("Giacomino");
        info.setCognome("Poretti");
        info.setDataDiNascita(java.sql.Date.valueOf("1966-10-22"));

        DataSource dataSource = new InfoAdapter(info);

        UserData userData = new UserData();
        userData.getData(dataSource);

        System.out.println("Nome completo: " + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEta());
    }
}
