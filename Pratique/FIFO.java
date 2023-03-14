package Pratique;

import java.util.LinkedList;

public class FIFO 
{
    public static void main(String[] args) 
    {
 
        LinkedList<String> listeFifo = new LinkedList<String>();
        String[] commandes = {"Commande1", "Commande2", "Commande3"};
        
        for (int i = 0; i < commandes.length; i++) 
        {
            listeFifo.add(commandes[i]);
        }

        /* 
        for (int i = 0; i < commandes.length; i++) 
        {
            String remove = listeFifo.remove();
            System.out.println(remove);
        }
        */
        
         // Boucle sortante
        for (int i = 0; i < commandes.length; i++) 
        {
            // Faire sortir les différents éléments de <commandes> sur la liste selon le principe FIFO
            String firstElement = listFifo.remove();   // Version FIFO
            // String firstElement = listFifo.removeLast();  // Version LIFO
            System.out.println(firstElement);
        }

        /*     
        for (int i = 2; i == 0 ; i--)
        {
            listeLIFO.add(commandes[i]);
        }
        */

        /* 
        for (int i = 0; i < commandes.length; i++) 
        {
            String remove = listeFIFO.removelast();
            System.out.println(remove);
        }
        */

    }
}        


/* 
public class FIFO 
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

{
    public static void main(String[] args) 
    {
        // création de TreeSet
        TreeSet  tset = new TreeSet();
         
        // ajouter des éléments à treeset
        tset.add("a");
        tset.add("b");
        tset.add("c");
         
        Iterator iterator = tset.iterator();
         
        // affichage des éléments de TreeSet
        System.out.println("Les éléments de treeset dans l'ordre croissant: "); 
        
        while (iterator.hasNext())
        {
             System.out.println(iterator.next());
        }
        
        List list = new ArrayList(tset);
         
        Collections.reverse(list);
         
        // affichage des valeurs à l'inverse
        System.out.println("Les éléments de treeset dans l'ordre inverse: "); 
        for(String s:list)
            System.out.println(s);
    }
}

*/        

    

