package no.hiof.johnmh.oblig2;

public class Oppgave2 {
    public static void main(String[] args) {
        TVSerie show1 = new TVSerie("csi", "1995");

        Episode killing = new Episode(1, 1, "Killing", 90);

        Episode detectiv = new Episode(2, 1, "Detectiv", 90);

        show1.leggTilEpisoder(killing);
        show1.leggTilEpisoder(detectiv);

        System.out.println(show1.getTittel() + " " + show1.getUtgivelsesDato());

        

    }


}
