package Esercizio1;

import java.util.Calendar;

public class InfoAdapter implements DataSource {
    private final Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        cal.setTime(info.getDataDiNascita());
        int birthYear = cal.get(Calendar.YEAR);
        return currentYear - birthYear;
    }
}

