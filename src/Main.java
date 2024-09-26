import enteties.CheckIn;
import enteties.Dipartimento;
import enteties.Dipendente;
import enteties.dipendentiClass.DipendenteFullTime;
import enteties.dipendentiClass.DipendentePartTime;
import enteties.dipendentiClass.Dirigente;
import enteties.dipendentiClass.Volontario;

public class Main {
    public static void main(String[] args) {

        System.out.println("Esercizio 1");
//
//        Dipendente dip1 = new Dipendente("D0001", 1800.00, Dipartimento.AMMINISTRAZIONE);
//        Dipendente dip2 = new Dipendente("D0002", 1500.00, Dipartimento.PRODUZIONE);
//        Dipendente dip3 = new Dipendente("D0003", 1300.00, Dipartimento.VENDITE);
//
//        Dipendente [] dipsArray = {dip1,dip2,dip3};
//
//        for (Dipendente dip : dipsArray) {
//            System.out.println("Matricola: " + dip.getMatricola());
//        }

        System.out.println("Esercizio 2");

        Dipendente dip1 = new DipendenteFullTime("D0002", Dipartimento.PRODUZIONE, 1700);
        Dipendente dip2 = new DipendentePartTime("D0003", Dipartimento.VENDITE, 7.50, 120);
        Dipendente dip3 = new Dirigente("D0001", Dipartimento.AMMINISTRAZIONE, 2500, 750);

        Dipendente[] dipsArray = {dip1, dip2, dip3};

        double totStipendi = 0.0;
        for (Dipendente dipendente : dipsArray) {
            double stipendio = dipendente.calcoloStipendio();
            totStipendi += stipendio;
            System.out.println("Matricola: " + dipendente.getMatricola() + " Dipartimento: " + dipendente.getDipartimento() + " Stipendio: " + stipendio);
        }

        System.out.println("Totale Stipendi: " + totStipendi);

        System.out.println("Esercizio 3");

        Volontario vol1 = new Volontario("Aldo Bianchi", 30, "CV a Caso");
        Volontario vol2 = new Volontario("Paolo Neri", 32, "CV a Caso");

        CheckIn [] personale = {dip1,dip2,dip3,vol1,vol2};

        for (CheckIn persona : personale) {
            persona.checkIn();
        }

    }
}

