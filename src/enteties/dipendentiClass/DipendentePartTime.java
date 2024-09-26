package enteties.dipendentiClass;

import enteties.Dipartimento;
import enteties.Dipendente;

public class DipendentePartTime extends Dipendente {
    private double pagaOraria;
    private int oreDiLavoro;

    public DipendentePartTime(String matricola,Dipartimento dipartimento, double pagaOraria, int oreDiLavoro) {
        super(matricola, dipartimento);
        this.pagaOraria = pagaOraria;
        this.oreDiLavoro = oreDiLavoro;
    }


    @Override
    public double calcoloStipendio() {
        return pagaOraria * oreDiLavoro;
    }

    @Override
    public void checkIn() {
        System.out.println("Dipendente Part-Time con matricola " + getMatricola() + " ha iniziato il turno di lavoro.");
    }
}
