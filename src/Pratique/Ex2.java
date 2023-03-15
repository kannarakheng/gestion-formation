package Pratique;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.http.HttpRequest.BodyPublisher;
import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args) throws Exception
    {
        String chaine1 = "l'hiver sera pluvieux";
        String chaine2 = "l'hiver sera froid";

        System.out.println("le 3eme caractère de la chaine 1 est " + chaine1.charAt(2));

        System.out.println("la chaine 1 contient " + chaine1.length() + " caractères");

        System.out.println("un morceau de la chaine 1 : " + chaine1.substring(2, 7));

        if (chaine1.equals(chaine2)) 
        {
            System.out.println("les deux chaines sont identiques");    
        } 
        else 
        {
            System.out.println("les deux chaines sont différentes");    
        }
        
        
        if (chaine1.compareTo(chaine2)>0) {
            System.out.println("chaine1 est supérieure à la chaine2");
            
        } else if(chaine1.compareTo(chaine2)<0) {
            System.out.println("chaine1 est inférieure a chaine2");
        }
        else {
            System.out.println("les deux chaines sont identiques");
        }
        
        String recherche;
        int position;
        recherche = "e";
        position = chaine1.indexOf(recherche);

        while (position >= 0) 
        {
            System.out.println("chaine trouvée à la position " + position);
            position = chaine1.indexOf(recherche, position+1);
            
        }
        System.out.println("fin de la recherche");

        String chaine3;
        chaine3 = chaine1.replace("hiver", "été");
        System.out.println(chaine3);
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Comment t'appelles-tu ?");
        String name = br.readLine();

        System.out.println(name);

        Scanner sc = new Scanner(System.in);
        System.out.println("Acceder a quel niveau ?");
        int game_level = sc.nextInt();
        System.out.println(game_level);

        


    }
}
