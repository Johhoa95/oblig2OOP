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

    @Override
    public String toString() {
        return "Episode{" +
                "episodeNummer=" + episodeNummer +
                ", sesong=" + sesong +
                ", tittel='" + tittel + '\'' +
                ", spilleTid=" + spilleTid +
                '}';
    }

    public Episode(int episodeNummer, int sesong, String tittel, int spilleTid) {
        this.episodeNummer = episodeNummer;
        this.sesong = sesong;
        this.tittel = tittel;
        this.spilleTid = spilleTid;
    }

    public int getEpisodeNummer() {
        return episodeNummer;
    }

    public void setEpisodeNummer(int episodeNummer) {
        this.episodeNummer = episodeNummer;
    }

    public int getSesong() {
        return sesong;
    }

    public void setSesong(int sesong) {
        this.sesong = sesong;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public int getSpilleTid() {
        return spilleTid;
    }

    public void setSpilleTid(int spilleTid) {
        this.spilleTid = spilleTid;
    }
}
