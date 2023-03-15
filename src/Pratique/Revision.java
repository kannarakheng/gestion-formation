package Pratique;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Revision 
{
    public static void main(String[] args) 
    {
        //Declaration des variables
        //Initilisation des variables
        String[] nomEleves = {"armand", "barbara", "claude", "didier", "eric"};
        String[] mdpEleves = {"armand", "barbara", "clause", "didier", "eric"};
        String nomAdmin = "admin";
        String mdpAdmin = "admin";
        String CODEARRET = "stop";
        
        //Declaration d'une variable boolean
        //pour gerer la connexion/deconnexion  
        Boolean arreterPrg = false;

        Scanner sc = new Scanner(System.in);

        //Saisir un login tant que arreterPrg == true
        while (arreterPrg == false) 
        {
            System.out.println("Login :");
            String userLogin = sc.nextLine();
            
            if (userLogin.equals(CODEARRET))
            {
                traitArretProg();
                arreterPrg = true;
            }
            else 
                if (userLogin.equals(nomAdmin)) 
                    traitAdmin();
                else 
                    traitEleves();
        }
        
    }

    static void traitArretProg()
    {
        System.out.println("Demande pour arrêter le programme");
    }

    static void traitAdmin() 
    {
        Scanner sc2 = new Scanner(System.in);
        
        String MDPADMIN = "admin";
        boolean bonmdp = false;
        int compteur = 0;

        do 
        {
            System.out.println("Mot de passe :");
            String uMotPasse = sc2.nextLine();
            //System.out.println(uMotPasse);

            if (uMotPasse.equals(MDPADMIN)) 
            {
                bonmdp = true;
                compteur = compteur + 1;
                    
            } 
            else 
            {
                compteur = compteur + 1;                    
            }
        } 
        while ((compteur < 5) && (bonmdp == false));

        if (bonmdp)
        {
            System.out.println("Bienvenue au menu de l'administrateur");
            traitMenuAdm();
            
        }
        else 
            System.out.println("Nom utilisateur inconnu !");
        
        //System.out.println("Traitement pour l'administrateur");
    }

    static void traitMenuAdm()
    {
        System.out.println("1 : Saisie des notes d'un étudiant");
        System.out.println("2 : Affichage de la moyenne d'un étudiant");
        System.out.println("3 : Afficher la présence des étudiants");
        System.out.println("0 : Quitter et retourner au login");

        Scanner sc3 = new Scanner(System.in);
        
        String choixMenuAdm = "";
        
        do 
        {
            System.out.println("Taper votre choix :");
            String choixMenuAdm = sc3.nextLine();
            //System.out.println(choixMenuAdm);

            if ((choixMenuAdm).equals("1")) 
            {
                traitSaisieNotes();                        
            } 
            else
                if ((choixMenuAdm).equals("2"))
                {
                    traitAfficherMoyEtudiant();
                }
                else
                    if ((choixMenuAdm).equal("3"))
                    {
                    }
                
            }
        } 
        while ((choixMenuAdm.equals("0")));

    }

    static void traitEleves()
    {
        System.out.println("Traitement pour les élèves");
    }
}
