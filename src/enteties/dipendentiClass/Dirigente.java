package enteties.dipendentiClass;

import enteties.Dipartimento;

public class Dirigente extends DipendenteFullTime {
    private double bonus;

    public Dirigente(String matricola, Dipartimento dipartimento, double stipendioMensile, double bonus) {
        super(matricola, dipartimento, stipendioMensile);
        this.bonus = bonus;
    }

    @Override
    public double calcoloStipendio() {
        return stipendioMensile + bonus;
    }

    @Override
    public void checkIn() {
        System.out.println("Dirigente con matricola " + getMatricola() + " ha iniziato il turno di lavoro.");
    }
}
