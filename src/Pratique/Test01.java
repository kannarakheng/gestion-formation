package Pratique;

import javax.swing.JFrame;

public class Test01 
{
    public static void main(String[] args) 
    {
        Fenetre fen = new Fenetre();

    }

    public class Fenetre extends JFrame
    {
        public Fenetre()
        {
            this.setTitle("Ma première fenêtre Java");

            this.setSize(400, 100);

            this.setLocationRelativeTo(null);

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            this.setVisible(true);    
        }
    }    

}