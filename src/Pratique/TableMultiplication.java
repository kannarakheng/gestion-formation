package Pratique;

import java.util.Scanner;

public class TableMultiplication {
    public static void main(String[] args) throws Exception {
        //Creer l'objet scan du classe Scanner par le mot-cle "new"
        Scanner scan = new Scanner(System.in);

        //Imprimer à l'utilisateur l'étiquette de la donnée d'entrée à saisir
        System.out.println("Entrer un nombre entier inférieur à 10 :");

        //String snombreaMultiplier = scan.nextLine();
        int inombreaMultiplier = 0;

        boolean siException;
        do {
            //Utiliser l'objet scan pour attendre que l'utilisateur saisit la donnée (avec la touche Enter pour valider)
            String snombreaMultiplier = scan.nextLine();

            //Comme la valeur capté est de type String, il faut "try" la conversion qui peut échouer en Exception
            //c'est pas recommandé que l'exception monte à l'utilisateur 
            //donc il faut intervenir et faire "catch"
            try {
                //La méthode valueOf peut exister sur d'autre types de classe, ex: String.valueOf
                inombreaMultiplier = Integer.valueOf(snombreaMultiplier);
                siException = false;
            } catch (Exception e) {
                //J'affiche un message plus "user-friendly" que l'exception
                System.out.println("Format indéfini");
                siException = true;
            }
        }
        while (siException == true);

        //int inombreaMultiplier = Integer.valueOf(snombreaMultiplier);

        int ligneTableMulti = 0;

        System.out.println("Résultat");

        for (int i = 1; i < 11; ++i) {
            
            ligneTableMulti = inombreaMultiplier * i;

            System.out.println(inombreaMultiplier + "X" + i + "=" + ligneTableMulti);
            
        }

    }

}
