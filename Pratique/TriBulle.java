package Pratique;

public class TriBulle 
{
    public static void main(String[] args)
    {
        //déclaration d'une table d'entiers à trier
        //et initialisation des valeurs de la table
        int arr[] ={29, 2, 49, 1, 5, 13, 1, 39, 40, 27, 8, 39, 23, 11};  
      
        //afficher la table non triée
        System.out.println("Avant le tri a bulle"); 
        //afficher la table des valeurs arr
        //en appelant la fonction displayTab avec le tableau arr comme paramètre d'entrée
        displayTab(arr);
      
        //tri des elements de tableau arr avec le tri a bulle
        //en appelant la fonction tri_bulle avec le tableau arr comme paramètre d'entrée
        tri_bulle(arr);

        //afficher la table triée
        System.out.println("Apres le tri a bulle");  
        displayTab(arr); 
    }

    static void tri_bulle(int[] tab)
    {  
        //declaration des variables
        int taille = tab.length;  
        int tmp = 0;  
    
        //traitement du tri a bulle
        for(int i=0; i < taille; i++) 
        {
            for(int j=1; j < (taille-i); j++)
            {  
                if(tab[j-1] > tab[j])
                {
                    //echange de places/swaping entre les 2 elements 
                    //quand tab[j-1] > tab[j] en utilisant une variable temporaire tmp
                    tmp = tab[j-1];  
                    tab[j-1] = tab[j];  
                    tab[j] = tmp;  
                }
      
            }
        }
    }
    
    static void displayTab(int[] tab)
    {    
        for(int i=0; i < tab.length; i++)
        {
            System.out.print(tab[i] + " ");  
        }
        System.out.println();
    }
    
}
