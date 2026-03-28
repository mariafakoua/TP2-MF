/**
 * 420-266-H26 – POO II
 * TP1 - Heritage
 * Nom : Fakoua
 * Prénom: Maria
 */
package livres;
import java.util.ArrayList;


public class Serie {
    private String nom;
    private ArrayList<Ouvrage> ouvrages;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Ouvrage> getOuvrages() {
        return ouvrages;
    }

    public Serie(String nom) {
        this.nom = nom;
        this.ouvrages = new ArrayList<>();
    }
}
