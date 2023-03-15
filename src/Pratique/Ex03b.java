package Pratique;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03b 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choissisez votre mot");
        String motJeu = scan.nextLine();

        ArrayList<String> listeProgres = new ArrayList<String>();
        //System.out.println("listeProgres =" + listeProgres);

        int listeProgressize = motJeu.length();
        //System.out.println("listeProgressize =" + listeProgressize);

        for (int index=0; index < listeProgressize; index++)
        {
            listeProgres.add("_");
        }
        System.out.println("listeProgres =" + listeProgres);


        while (listeProgres.contains("_")) {
            System.out.println(String.join(" ",listeProgres));   

            System.out.println("Entrer votre lettre :");
            String lettre = scan.nextLine();
            
            int indexletter = motJeu.indexOf(lettre);
            if (indexletter == -1) 
            {
                System.out.println("Echec !");
            }

            while (indexletter != -1) 
            {
                listeProgres.set(indexletter, lettre);
                indexletter = motJeu.indexOf(lettre, indexletter+1);
            }
        }
        System.out.println("Bien joué vous avez trouvé le bon mot :" + listeProgres);
    }    
}
