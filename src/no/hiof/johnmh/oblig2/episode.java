package no.hiof.johnmh.oblig2;

public class Episode {
    private int episodeNummer;
    private int sesong;
    private String tittel;
    private int spilleTid;

    public Episode(int episodeNummer, int sesong, String tittel) {
        this.episodeNummer = episodeNummer;
        this.sesong = sesong;
        this.tittel = tittel;
    }

    public Episode(int episodeNummer, int sesong, String tittel, int spilleTid) {
        this.episodeNummer = episodeNummer;
        this.sesong = sesong;
        this.tittel = tittel;
        this.spilleTid = spilleTid;
    }


}
