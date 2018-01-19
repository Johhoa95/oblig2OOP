package no.hiof.johnmh.oblig2;

public class Episode {
    private String episodeNummer;
    private String sesong;
    private String tittel;
    private int spilleTid;

    public Episode(String episodeNummer, String sesong, String tittel) {
        this.episodeNummer = episodeNummer;
        this.sesong = sesong;
        this.tittel = tittel;
    }

    public Episode(String episodeNummer, String sesong, String tittel, int spilleTid) {
        this.episodeNummer = episodeNummer;
        this.sesong = sesong;
        this.tittel = tittel;
        this.spilleTid = spilleTid;
    }


}
