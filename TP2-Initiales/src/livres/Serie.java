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

    public void ajouteOuvrage(Ouvrage ouvrage){
        this.ouvrages.add(ouvrage);
    }

    public void enleveOuvrage(Ouvrage ouvrage){
        this.ouvrages.remove(ouvrage);
    }

    public Integer getOuvrageTaille(){
        return this.ouvrages.size();
    }

    public Serie(String nom) {
        this.nom = nom;
        this.ouvrages = new ArrayList<>();
    }
}
