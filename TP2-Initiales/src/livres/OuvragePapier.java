/**
 * 420-266-H26 – POO II
 * TP1 - Heritage
 * Nom : Fakoua
 * Prénom: Maria
 */


package livres;

import java.time.LocalDate;

public class OuvragePapier extends Ouvrage {
    private int nbPages;

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public OuvragePapier(String titre, Auteur auteur, Format type,
                         LocalDate date, int nombreExemplaires, int nbPages){
        super(titre,auteur,type, date, nombreExemplaires);
        this.nbPages = nbPages;
    }

    public OuvragePapier(String titre, Auteur auteur, Format type, int nbPages){
        super(titre,auteur,type);
        this.nbPages = nbPages;
    }

    public OuvragePapier(String titre, Auteur auteur, int nbPages){
        super(titre,auteur);
        this.nbPages = nbPages;
    }
}
