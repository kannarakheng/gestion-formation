package Pratique;

public class ExTableau2 {
    /**
     * @param args
     */
    public static void main(String[] args){
        int[] tab = {15, 16, 20, 15};
        
        int somme;
        double moyenne;
        somme = 0;
        moyenne = 0.00;

        for (int i = 0; i < tab.length; ++i) {
            somme = somme + tab[i];
        }

        moyenne = somme / tab.length;
        String moyenneString = String.valueOf(moyenne);

        System.out.println("La moyenne du tableau est égal à " + moyenneString);

    }
    
}
