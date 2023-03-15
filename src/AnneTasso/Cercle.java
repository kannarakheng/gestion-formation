package AnneTasso;

import java.util.Scanner;

public class Cercle 
{
    public static void main(String[] args) 
    {
        //déclaration des variables
        double unRayon, lePerimetre;
        Scanner lectureClavier = new Scanner(System.in);

        //afficher le message "Valeur du rayon" à l'écran
        System.out.println("Valeur du rayon : ");
        //Lire au clavier une valeur et placer cette valeur dans unRayon
        unRayon = lectureClavier.nextDouble();
        
        //calculer la surface
        lePerimetre = Math.PI * unRayon * unRayon;

        //aficher le résulat
        System.out.print("Le cercle de rayon " + unRayon + " a pour périmètre : " + lePerimetre);
        
        
    }    
}
