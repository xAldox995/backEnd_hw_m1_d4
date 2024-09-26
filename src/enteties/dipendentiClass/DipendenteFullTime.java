package enteties.dipendentiClass;

import enteties.Dipartimento;
import enteties.Dipendente;

public class DipendenteFullTime extends Dipendente {

    double stipendioMensile;

    public DipendenteFullTime(String matricola, Dipartimento dipartimento, double stipendioMensile) {
        super(matricola, dipartimento);
        this.stipendioMensile = stipendioMensile;
    }

    public double calcoloStipendio() {
        return stipendioMensile;
    }

    @Override
    public void checkIn() {
        System.out.println("Dipendente Full-Time con matricola " + getMatricola() + " ha iniziato il turno di lavoro.");
    }
}
