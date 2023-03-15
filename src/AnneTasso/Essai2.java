package AnneTasso;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Essai2
{
    public static void main(String[] args)
    { 
        try 
        {
     
        File file = new File("d:\\nouveau_fichier_test.txt");
     
        if (file.createNewFile())
        {
            System.out.println("Fichier créé!");
        }
        else
        {
            System.out.println("Fichier existe déjà.");
        }
     
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    
}

