package Pratique;

import java.util.Scanner;

public class Ex01 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Login :");
        String userLogin = scan.nextLine();

        String userAdmin = "admin";

        //System.out.println("Mot de passe:");
        //String userMotPasse = scan.nextLine();

        System.out.println(userLogin.equals(userAdmin));
        //String uMotPasse = "";

        /*
        if (userLogin.equals(userAdmin)) {
            System.out.println("Mot de passe :");
            String uMotPasse = scan.nextLine();
            System.out.println(uMotPasse);

        } else {
            System.out.println("Nom utilisateur inconnu !");

        };
        */
        String mdpAdmin = "123456";

        if (userLogin.equals(userAdmin)) {
            
        
            boolean bonmdp = false;
            int compteur = 1;

            do {
                System.out.println("Mot de passe :");
                String uMotPasse = scan.nextLine();
                System.out.println(uMotPasse);

                if (uMotPasse.equals(mdpAdmin)) {
                    bonmdp = true;
                    compteur = 6;
                    
                } else {
                    compteur = compteur + 1;                    
                }
            } while (compteur < 6);

            if (bonmdp) {

                System.out.println("Bienvenue " + userLogin);
                                
            } else {
                System.out.println("Compte bloqué");
                
            }

            System.out.println();

        } else {
            System.out.println("Nom utilisateur inconnu !");

        };

        //String password = scan.nextLine();

        /*
        String passwordAdmin = "123456";
                
        if (userMotPasse.equals(passwordAdmin)) {
            System.out.println("Bienvenue ");

        } else {
            System.out.println("Mot de passe incorrect");

        }

        */

        scan.close();


    }
}
