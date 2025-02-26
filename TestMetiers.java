import java.util.ArrayList;

public class TestMetiers {
    public static void main(String[] argv) {
        ArrayList<Coronavirus> coronavirusList = new ArrayList<Coronavirus>();

        coronavirusList.add(new Alpha("B.1.1.7"));
        coronavirusList.add(new Beta("B.1.351"));
        coronavirusList.add(new Gamma("P.1"));
        coronavirusList.add(new Omicron("B.1.1.529"));
        coronavirusList.add(new Gamma("P.1"));
        coronavirusList.add(new Delta("B.1.617.2"));
        coronavirusList.add(new Omicron("B.1.1.529"));
        coronavirusList.add(new Alpha("B.1.1.7"));
        coronavirusList.add(new Omicron("B.1.1.529"));

        coronavirusList.forEach(element -> {
            element.affiche();
        });
    }

}

// Classe abstraite représentant un coronavirus générique
abstract class Coronavirus {
    // Attribut pour stocker le nom scientifique
    protected String nomScientifique;
    
    /**
     * Constructeur
     * @param nomScientifique Le nom scientifique du variant
     */
    public Coronavirus(String nomScientifique) {
        this.nomScientifique = nomScientifique;
    }
    
    /**
     * Méthode abstraite qui doit être implémentée par les sous-classes
     * pour afficher les informations du variant
     */
    public abstract void affiche();
}

/**
 * Variant Alpha du coronavirus
 */
class Alpha extends Coronavirus {
    /**
     * Constructeur
     * @param nomScientifique Le nom scientifique du variant Alpha
     */
    public Alpha(String nomScientifique) {
        super(nomScientifique);
    }
    
    /**
     * Implémentation de la méthode d'affichage pour le variant Alpha
     */
    @Override
    public void affiche() {
        System.out.println("Variant Alpha (UK) - " + nomScientifique + " - Première identification: Royaume-Uni, septembre 2020");
    }
}

/**
 * Variant Beta du coronavirus
 */
class Beta extends Coronavirus {
    /**
     * Constructeur
     * @param nomScientifique Le nom scientifique du variant Beta
     */
    public Beta(String nomScientifique) {
        super(nomScientifique);
    }
    
    /**
     * Implémentation de la méthode d'affichage pour le variant Beta
     */
    @Override
    public void affiche() {
        System.out.println("Variant Beta (Afrique du Sud) - " + nomScientifique + " - Première identification: Afrique du Sud, mai 2020");
    }
}

/**
 * Variant Gamma du coronavirus
 */
class Gamma extends Coronavirus {
    /**
     * Constructeur
     * @param nomScientifique Le nom scientifique du variant Gamma
     */
    public Gamma(String nomScientifique) {
        super(nomScientifique);
    }
    
    /**
     * Implémentation de la méthode d'affichage pour le variant Gamma
     */
    @Override
    public void affiche() {
        System.out.println("Variant Gamma (Brésil) - " + nomScientifique + " - Première identification: Brésil, novembre 2020");
    }
}

/**
 * Variant Delta du coronavirus
 */
class Delta extends Coronavirus {
    /**
     * Constructeur
     * @param nomScientifique Le nom scientifique du variant Delta
     */
    public Delta(String nomScientifique) {
        super(nomScientifique);
    }
    
    /**
     * Implémentation de la méthode d'affichage pour le variant Delta
     */
    @Override
    public void affiche() {
        System.out.println("Variant Delta (Inde) - " + nomScientifique + " - Première identification: Inde, octobre 2020");
    }
}

/**
 * Variant Omicron du coronavirus
 */
class Omicron extends Coronavirus {
    /**
     * Constructeur
     * @param nomScientifique Le nom scientifique du variant Omicron
     */
    public Omicron(String nomScientifique) {
        super(nomScientifique);
    }
    
    /**
     * Implémentation de la méthode d'affichage pour le variant Omicron
     */
    @Override
    public void affiche() {
        System.out.println("Variant Omicron (Multiple) - " + nomScientifique + " - Première identification: Multiple pays, novembre 2021");
    }
}

// La classe TestMetiers est déjà fournie dans l'énoncé