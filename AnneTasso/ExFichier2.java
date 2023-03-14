package AnneTasso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExFichier2 
{
    public static void main(String[] args) 
    {
        //lecture fichier texte
        Path f1 = Paths.get("d:\\documents\\javadev\\projet1\\AnneTasso\\infos.txt");
        
        try 
        {
            BufferedReader bfr = Files.newBufferedReader(f1);

            String ligneText1 = bfr.readLine();

            //System.out.println(bfr.read());
            //System.out.println(bfr.readLine());
            System.out.println(ligneText1);
            System.out.println(bfr.readLine());
            System.out.println(bfr.readLine());
            
            bfr.close();
        } 
        catch (IOException e) 
        {
            System.out.println("IOException : " + e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Exception : " + e.getMessage());
        }
        //finally
        //{
        //
        //}
        
        //ecriture fichier texte
        Path f2 = Paths.get("d:\\documents\\javadev\\projet1\\AnneTasso\\infos2.txt");
        
        try 
        {
            BufferedWriter bfw = Files.newBufferedWriter(f2);

            bfw.write("Bonjour");
            bfw.newLine();
            bfw.write("Hello");
            bfw.newLine();
            bfw.write("Hallo");
            
            bfw.close();
        } 
        catch (IOException e) 
        {
            System.out.println("IOException : " + e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Exception : " + e.getMessage());
        }

        //lecture du fichier1 et ecriture du contenu sur le fichier2
        Path f3 = Paths.get("d:\\documents\\javadev\\projet1\\AnneTasso\\infos.txt");
        Path f4 = Paths.get("d:\\documents\\javadev\\projet1\\AnneTasso\\infos3.txt");
        
        try 
        {
            BufferedReader bfr1 = Files.newBufferedReader(f3);

            String ligneText1 = bfr1.readLine();
            String ligneText2 = bfr1.readLine();
            String ligneText3 = bfr1.readLine();

            BufferedWriter bfw3 = Files.newBufferedWriter(f4);

            bfw3.write(ligneText1,0,24);
            bfw3.newLine();
            bfw3.write(ligneText2);
            bfw3.newLine();
            bfw3.write(ligneText3);

            bfr1.close();
            bfw3.close();
        } 
        catch (IOException e) 
        {
            System.out.println("IOException : " + e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Exception : " + e.getMessage());
        }
        
    }
   
}
