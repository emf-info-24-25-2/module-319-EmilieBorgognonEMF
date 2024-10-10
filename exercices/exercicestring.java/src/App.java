public class App {
    public static void main(String[] args) throws Exception {
        String machainedecaractere = "voici du contenu stocké dans un string.";
        System.out.println(" Nombre de caractères contenu dans la variable maChaineDeCaractere :" + machainedecaractere.length() );
        int positionContenu = machainedecaractere.indexOf("contenu");
        System.out.println("Le mot \"contenu\" commence à la position : " + positionContenu);
        char lettrePosition10 = machainedecaractere.charAt(10);
        System.out.println("Le position 10 contient la lettre : " + lettrePosition10);
        String monPrenom = "emilie";
        for(int i = 0; i < monPrenom.length(); i++){
            System.out.println("La lettre à la position " + i +" est : " + monPrenom.charAt(i));
        }

        if (monPrenom.contains("test")) {
            System.out.println("La chaîne de caractère " + monPrenom + " contient le texte test.");
        } else {
            System.out.println("La chaîne de caractère " + monPrenom + " ne contient pas le texte test.");
        }
        
        
    }
}
