package tests;

import java.time.LocalDate;
import java.util.List;

import livres.*;

/**
 * CoursPOO 1
 *
 * @author Julien.Brunet màj Jocelyn
 * @since H25
 */
public class TestOuvrage {

    public static void main(String[] args) {
        TestOuvrage test = new TestOuvrage();
        test.testOuvrages();
        test.testTrouver();
    }


    public void testOuvrages() {
        //Deux auteurs deja prets pour les tests...
        Auteur albertine = new Auteur("Albertine", "Tremblay", new Pays("Canada", "CAD"));
        Auteur john = new Auteur("John", "Smith", new Pays("Etats-Unis", "USA"));


        //Voici une partie des tests! Il faut en ajouter, pour les fonctionnalités non testées!
        System.out.println("-----Test des constructeurs d'ouvrage et des diverses validations-----------");
        Ouvrage livreA = new OuvrageAudio("Titre assez long", john, Ouvrage.Format.AUDIO, 5, OuvrageAudio.FormatOuvrageAudio.ANALOGIQUE);
        System.out.println(livreA);
        Ouvrage livreB = new OuvrageAudio("Ti", john, Ouvrage.Format.VIDEO, 7, OuvrageAudio.FormatOuvrageAudio.NUMERIC);
        System.out.println(livreB);
        Ouvrage livreC = new OuvrageAudio(null, john, Ouvrage.Format.PAPIER, 4, OuvrageAudio.FormatOuvrageAudio.NUMERIC);
        System.out.println(livreC);

        //bibliotheque.Auteur null et valeur par défaut de l'bibliotheque.Auteur
        Ouvrage livreA1 = new OuvrageAudio("Titre assez long", null, Ouvrage.Format.PAPIER, 9, OuvrageAudio.FormatOuvrageAudio.ANALOGIQUE);
        System.out.println(livreA1);
        //bibliotheque.Auteur fonctionnel
        Ouvrage livre1 = new OuvrageAudio("Tout va bien", albertine, Ouvrage.Format.PAPIER, 7, OuvrageAudio.FormatOuvrageAudio.NUMERIC);
        System.out.println(livre1);

        //Date null et valeur par défaut de la date
        livre1.setDate(null);
        System.out.println(livre1);
        livre1.setDate(LocalDate.now().minusYears(5));
        System.out.println(livre1);

        //Test de la validation sur le nb d'exemplaires (valide et non valide)
        Ouvrage livre2 = new OuvrageAudio("Tout va bien", albertine, Ouvrage.Format.AUDIO, LocalDate.now(), -10, 8, OuvrageAudio.FormatOuvrageAudio.ANALOGIQUE);
        System.out.println(livre2);

        livre2 = new OuvrageAudio("Tout va bien", albertine, Ouvrage.Format.PAPIER, LocalDate.now(), 20, 9, OuvrageAudio.FormatOuvrageAudio.NUMERIC);
        System.out.println(livre2);

        System.out.println("\n-----Tests des méthodes acheter et vendre-----------");

        Ouvrage livre3 = new OuvrageAudio("Musique du hasard", new Auteur("Paul", "Auster", new Pays("Etats-Unis", "USA")), Ouvrage.Format.PAPIER, LocalDate.now(), 5, 9, OuvrageAudio.FormatOuvrageAudio.ANALOGIQUE);

        System.out.println(livre3);

        livre3.acheter(5);
        System.out.println(livre3);

        System.out.println("On peut vendre 8 livres? " + livre3.vendre(8));
        System.out.println(livre3);

        System.out.println("On peut vendre 10 livres? " + livre3.vendre(10));
        System.out.println(livre3);

        Ouvrage livre4 = new OuvrageAudio("Test", new Auteur("A", "B", new Pays("Etats-Unis", "USA")), Ouvrage.Format.PAPIER, LocalDate.now(), 5, 7, OuvrageAudio.FormatOuvrageAudio.NUMERIC);

        System.out.println("\n-----Tests de la  méthode equals()-----------");
        //Deux ouvrages égaux
        Ouvrage livre5 = new OuvrageAudio("Test", new Auteur("A", "B", new Pays("Etats-Unis", "USA")), Ouvrage.Format.PAPIER, null, 5, 3, OuvrageAudio.FormatOuvrageAudio.ANALOGIQUE);
        Ouvrage livre6 = new OuvrageAudio("Test", new Auteur("A", "B", new Pays("Etats-Unis", "USA")), Ouvrage.Format.PAPIER, LocalDate.now(), 10, 9, OuvrageAudio.FormatOuvrageAudio.NUMERIC);
        //Un qui ne l'est pas
        Ouvrage livre7 = new OuvrageAudio("Test", new Auteur("Z", "B", new Pays("Etats-Unis", "USA")), Ouvrage.Format.PAPIER, LocalDate.now(), 5, 8, OuvrageAudio.FormatOuvrageAudio.ANALOGIQUE);

        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + livre4.equals(livre5));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + livre4.equals(livre6));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals(livre7));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals(john));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals(null));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals("Test"));

        Serie serie = new Serie("Serie1");
        serie.ajouteOuvrage(livre1);
        System.out.println("Vous avez ajouté un ouvrage" + livre1.getTitre());
        serie.ajouteOuvrage(livre2);
        System.out.println("Vous avez ajouté un ouvrage" + livre2.getTitre());

        serie.enleveOuvrage(livre2);
        System.out.println("Vous avez retiré un ouvrage" + livre2.getTitre());

        System.out.println("Totale de ouvrages" + serie.getOuvrageTaille());

        Pays pays = new Pays("Lebanon", "LEB");
        Auteur auteur = new Auteur("A", "B", pays);

    }


    private void testTrouver() {
        Librairie bibliotheque = new Librairie();
        Auteur john = bibliotheque.getAuteurs().get(1);

        System.out.println("\n-----Test de votre méthode trouverOuvrage-----------");
        List<Ouvrage> resultat = bibliotheque.trouverOuvrages(new Auteur("Albertine", "Tremblay", new Pays("Canada", "CAD")));
        System.out.println("Livres de albertine: " + resultat);

        resultat = bibliotheque.trouverOuvrages(john);
        System.out.println("Livres de john: " + resultat);

        resultat = bibliotheque.trouverOuvrages(new Auteur("Jacques", "Beaulieu", new Pays("France", "FRA")));
        System.out.println("Livres de Jacques: " + resultat);
    }


}

