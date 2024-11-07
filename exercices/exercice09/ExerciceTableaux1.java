public class ExerciceTableaux1 {
    public static void main(String[] args) {
       
        int[] tableauEntiers = {1, 2, 3, 4, 5};
        
        System.out.println("Contenu du tableau d'entiers :");
        for (int i = 0; i < tableauEntiers.length; i++) {
            System.out.println("Cellule " + i + ": " + tableauEntiers[i]);
        }

        String[] tableauStrings = {"Bonjour", "tout", "le", "monde"};

        System.out.println("\nContenu du tableau de String :");
        for (int i = 0; i < tableauStrings.length; i++) {
            System.out.println("Cellule " + i + ": " + tableauStrings[i]);
        }
    }
}