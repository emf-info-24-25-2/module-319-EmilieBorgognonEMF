public class ExerciceBoucles1 {
    public static void main(String[] args) {
       
        System.out.println("Boucle for :");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Boucle for, itération " + i);
        }
        
       
        System.out.println("\nBoucle while :");
        int j = 1;
        while (j <= 5) {
            System.out.println("Boucle while, itération " + j);
            j++;
        }

        System.out.println("\nBoucle do-while :");
        int k = 1;
        do {
            System.out.println("Boucle do-while, itération " + k);
            k++;
        } while (k <= 5);
    }
}