package tests;

import livres.*;

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

        ouvrages.add(new OuvragePapier("Titre 1", john, Ouvrage.Format.PAPIER,4));
        ouvrages.add(new OuvrageVideo("Titre 2", albertine, Ouvrage.Format.VIDEO, 50, 900));
        ouvrages.add(new OuvrageVideo("Titre 3", john, Ouvrage.Format.VIDEO, 20, 200));
        ouvrages.add(new OuvragePapier("Titre 4", john, Ouvrage.Format.PAPIER,90));
        ouvrages.add(new OuvragePapier("Titre 5", albertine, Ouvrage.Format.PAPIER, 700));
        ouvrages.add(new OuvragePapier("Titre 6", john, Ouvrage.Format.PAPIER, 1000));
        ouvrages.add(new OuvrageVideo("Titre 7", john, Ouvrage.Format.VIDEO, 60,300));
        ouvrages.add(new OuvrageVideo("Titre 8", albertine,Ouvrage.Format.VIDEO, 7, 10));
        ouvrages.add(new OuvrageVideo("Titre 9", john,Ouvrage.Format.AUDIO, 70, 300));
        ouvrages.add(new OuvragePapier("Titre 10", jean, Ouvrage.Format.PAPIER, 8));
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
