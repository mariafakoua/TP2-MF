package tests;

import livres.Auteur;
import livres.Ouvrage;
import livres.OuvrageAudio;
import livres.Pays;

import java.util.ArrayList;
import java.util.List;

public class Librairie {
    private List<Auteur> auteurs  = new ArrayList<>();
    private List<Ouvrage> ouvrages = new ArrayList<>();

    public Librairie(){
        Auteur albertine = new Auteur("Albertine", "Tremblay", new Pays("Canada", "CAD"));
        Auteur john = new Auteur("John", "Smith", new Pays("Etats-Unis", "USA"));
        Auteur jean = new Auteur("Jean", "Némarre", new Pays("Suisse","SUI"));

        auteurs.add(albertine);
        auteurs.add(john);
        auteurs.add(jean);

        ouvrages.add(new OuvrageAudio("Titre 1", john, 6, OuvrageAudio.FormatOuvrageAudio.ANALOGIQUE));
        ouvrages.add(new OuvrageAudio("Titre 2", albertine, 9, OuvrageAudio.FormatOuvrageAudio.NUMERIC));
        ouvrages.add(new OuvrageAudio("Titre 3", john, 9, OuvrageAudio.FormatOuvrageAudio.NUMERIC));
        ouvrages.add(new OuvrageAudio("Titre 4", john, 3, OuvrageAudio.FormatOuvrageAudio.ANALOGIQUE));
        ouvrages.add(new OuvrageAudio("Titre 5", albertine, 6, OuvrageAudio.FormatOuvrageAudio.NUMERIC));
        ouvrages.add(new OuvrageAudio("Titre 6", john, 7, OuvrageAudio.FormatOuvrageAudio.NUMERIC));
        ouvrages.add(new OuvrageAudio("Titre 7", john, 9, OuvrageAudio.FormatOuvrageAudio.NUMERIC));
        ouvrages.add(new OuvrageAudio("Titre 8", albertine,Ouvrage.Format.VIDEO, 7, OuvrageAudio.FormatOuvrageAudio.ANALOGIQUE));
        ouvrages.add(new OuvrageAudio("Titre 9", john,Ouvrage.Format.AUDIO, 7, OuvrageAudio.FormatOuvrageAudio.NUMERIC));
        ouvrages.add(new OuvrageAudio("Titre 10", jean, 9, OuvrageAudio.FormatOuvrageAudio.NUMERIC));
    }

    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    public List<Ouvrage> getOuvrages() {
        return ouvrages;
    }

    public List<Ouvrage> trouverOuvrages(Auteur auteur) {
        //ATTENTION il faut implémenter equals dans auteur pour que ca marche!!!!!
        int count = 0;

        List<Ouvrage> trouves = new ArrayList<>();
        for (Ouvrage ouvrage : ouvrages) {
            if (ouvrage.getAuteur().equals(auteur)) {
                trouves.add(ouvrage);
            }
        }

        return trouves;
    }
}
