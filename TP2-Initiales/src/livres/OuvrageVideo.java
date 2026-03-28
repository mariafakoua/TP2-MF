/**
 * 420-266-H26 – POO II
 * TP1 - Heritage
 * Nom : Fakoua
 * Prénom: Maria
 */


package livres;

public class OuvrageVideo extends Ouvrage {
    private int minutes;
    private int taille;

    public OuvrageVideo(String titre, Auteur auteur, Format type, int minutes, int taille) {
        super(titre,auteur,type);
        this.minutes = minutes;
        this.taille = taille;
    }

    public OuvrageVideo(String titre, Auteur auteur, int minutes, int taille) {
        super(titre,auteur);
        this.minutes = minutes;
        this.taille = taille;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

}
