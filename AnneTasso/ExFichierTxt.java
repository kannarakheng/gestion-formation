package AnneTasso;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExFichierTxt 
{
    public static void main(String[] args) 
    {
        /*
        //Création de l'objet File
        File fichiertxt = new File("test.txt");

        //Utiliser qq fonctions de l'objet File
        System.out.println("Chemin absolu du fichier : " + fichiertxt.getAbsolutePath());
        System.out.println("Nom du fichier : " + fichiertxt.getName());
        System.out.println("Est-ce qu'il existe ? " + fichiertxt.exists());
        System.out.println("Est-ce un fichier ? " + fichiertxt.isFile());
        */

        //FileInputStream fichierEntree = null;
        FileInputStream fichierEntree = null;
        FileOutputStream fichierSortie = null;

        try 
        {
            //instancier nos objets
            //fis va lire le fichier
            //fos va écrire dans le nouveau
            fichierEntree = new FileInputStream(new File ("D:\\Documents\\JavaDev\\Projet1\\AnneTasso\\test.txt"));

            fichierSortie = new FileOutputStream(new File("D:\\Documents\\JavaDev\\Projet1\\AnneTasso\\test2.txt"));
            
            //créer un tableau de bytes pour indiquer le nbre de bytes lus à chaque tour de la boucle
            byte[] buf = new byte[8];
        
            //n informe le resultat de la lecture vaut -1 qd c'est fini
            int n = 0;

            while ((n = fichierEntree.read(buf)) >= 0) 
            {
                fichierSortie.write(buf);
                
                for (byte bit : buf) 
                {
                    System.out.print("\t" + bit + "(" + (char) bit + ")");
                }
                System.out.println("");
                buf = new byte[8];
            }
            System.out.println("Copie terminée !");
        }
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally 
        {
            try 
            {
                if (fichierEntree != null) 
                    fichierEntree.close();    
            } 
            catch (IOException e) 
            {
                e.printStackTrace();

            }

            try 
            {
                if (fichierSortie != null)
                    fichierSortie.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
