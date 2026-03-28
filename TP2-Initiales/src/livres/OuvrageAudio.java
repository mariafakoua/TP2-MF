package livres;

import java.time.LocalDate;

public class OuvrageAudio extends Ouvrage {

    public enum FormatOuvrageAudio {
        NUMERIC, ANALOGIQUE
    }

    private int dureeMinutes;
    private FormatOuvrageAudio format;

    public OuvrageAudio(String titre, Auteur auteur, Format type,
                        LocalDate date, int nombreExemplaires, int dureeMinutes, FormatOuvrageAudio format) {
        super(titre, auteur, type, date, nombreExemplaires);
        this.dureeMinutes = dureeMinutes;
        this.format = format;
    }

    public OuvrageAudio(String titre, Auteur auteur, Format type, int dureeMinutes, FormatOuvrageAudio format) {
        super(titre, auteur, type);
        this.dureeMinutes = dureeMinutes;
        this.format = format;
    }

    public OuvrageAudio(String titre, Auteur auteur, int dureeMinutes, FormatOuvrageAudio format) {
        super(titre, auteur);
        this.dureeMinutes = dureeMinutes;
        this.format = format;
    }

    public int getDureeMinutes() {
        return dureeMinutes;
    }

    public FormatOuvrageAudio getFormat() {
        return format;
    }

    public void setDureeMinutes(int dureeMinutes) {
        this.dureeMinutes = dureeMinutes;
    }

    public void setFormat(FormatOuvrageAudio format) {
        this.format = format;
    }
}