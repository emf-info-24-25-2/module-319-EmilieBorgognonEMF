import java.util.Random;

public class exmethode {

    
    public static int[] creerTableau(int taille) {
        return new int[taille];
    }

   
    public static int[] remplirAvecValeur(int[] tableau, int valeurFixe) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = valeurFixe;
        }
        return tableau;
    }

    public static int[] remplirAleatoire(int[] tableau) {                    
        Random rand = new Random();
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = rand.nextInt(21);
        }
        return tableau;
    }

    public static int tailleTableau(int[] tableau) {
        return tableau.length;
    }

    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tab[" + i + "]=" + tableau[i]);
        }
    }

    public static int valeurMin(int[] tableau) {
        int min = tableau[0];
        for (int value : tableau) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int valeurMax(int[] tableau) {
        int max = tableau[0];
        for (int value : tableau) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

  
    public static int compterFrequence(int[] tableau, int valeur) {
        int count = 0;
        for (int value : tableau) {
            if (value == valeur) {
                count++;
            }
        }
        return count;
    }

   
    public static int sommeTableau(int[] tableau) {
        int somme = 0;
        for (int value : tableau) {
            somme += value;
        }
        return somme;
    }


    public static double moyenneTableau(int[] tableau) {
        return (double) sommeTableau(tableau) / tableau.length;
    }

    
    public static int[] remplacerValeur(int[] tableau, int valeurRecherchee, int valeurRemplacement) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeurRecherchee) {
                tableau[i] = valeurRemplacement;
            }
        }
        return tableau;
    }

    public static int premiereOccurrence(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                return i;
            }
        }
        return -1; 
    }

   
    public static int derniereOccurrence(int[] tableau, int valeur) {
        for (int i = tableau.length - 1; i >= 0; i--) {
            if (tableau[i] == valeur) {
                return i;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int taille = 50;
        int[] tableau = creerTableau(taille);
        remplirAleatoire(tableau);

        System.out.println("Le tableau a une taille de " + taille + " cellules.\n");
        System.out.println("Contenu du tableau aléatoire : ");
        afficherTableau(tableau);

        int min = valeurMin(tableau);
        int max = valeurMax(tableau);
        System.out.println("La valeur min trouvée = " + min);
        System.out.println("La valeur max trouvée = " + max + "\n");

        remplacerValeur(tableau, 12, 5);
        System.out.println("Après remplacement de la valeur 12 par la valeur 5 voici le contenu du tableau : ");
        afficherTableau(tableau);
        System.out.println();

        int somme = sommeTableau(tableau);
        double moyenne = moyenneTableau(tableau);
        System.out.println("La somme des cellules du tableau = " + somme);
        System.out.printf("La moyenne des cellules du tableau = %.2f\n", moyenne);

        int valeurRecherchee = 13;
        int premierePos = premiereOccurrence(tableau, valeurRecherchee);
        int dernierePos = derniereOccurrence(tableau, valeurRecherchee);
        System.out.println("La valeur " + valeurRecherchee + " a été trouvée à la 1ère position N°" + premierePos);
        System.out.println("La valeur " + valeurRecherchee + " a été trouvée à la dernière position N°" + dernierePos);

    }
    
}