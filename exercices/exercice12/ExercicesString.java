public class ExercicesString {
    public static void main(String[] args) {
        
        String maChaineDeCaractere = "Voici du contenu stocké dans un String.";

        System.out.println("Nombre de caractères contenu dans la variable maChaineDeCaractere : " + maChaineDeCaractere.length());
        
        int positionContenu = maChaineDeCaractere.indexOf("contenu");
        System.out.println("Le mot \"contenu\" commence à la position : " + positionContenu);
        
        char lettrePosition10 = maChaineDeCaractere.charAt(10);
        System.out.println("Le position 17 contient la lettre : " + lettrePosition10);
        
        String monPrenom = "Nicolas";
 
        for (int i = 0; i < monPrenom.length(); i++) {
            char lettre = monPrenom.charAt(i);
            System.out.println("La lettre à la position " + i + " est : " + lettre);
        }
 
        if (monPrenom.contains("test")) {
            System.out.println("La chaîne de caractère \"" + monPrenom + "\" contient le texte \"test\".");
        } else {
            System.out.println("La chaîne de caractère \"" + monPrenom + "\" ne contient pas le texte \"test\".");
        }
    }
}