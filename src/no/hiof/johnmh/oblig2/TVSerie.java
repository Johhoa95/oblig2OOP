package no.hiof.johnmh.oblig2;

import java.util.ArrayList;

public class TVSerie {
    private String tittel;
    private String beskrivelse;
    private String utgivelsesDato;
    private ArrayList<Episode> episoder = new ArrayList<>();

    public void leggTilEpisoder(Episode episode){
        this.episoder.add(episode);
    }

    public TVSerie(String tittel, String utgivelsesDato) {
        this.tittel = tittel;
        this.utgivelsesDato = utgivelsesDato;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public String getUtgivelsesDato() {
        return utgivelsesDato;
    }

    public void setUtgivelsesDato(String utgivelsesDato) {
        this.utgivelsesDato = utgivelsesDato;
    }
}
