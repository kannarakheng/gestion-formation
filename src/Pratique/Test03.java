package Pratique;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test03 
{
    public static void main(String[] args) 
    {
        JFrame fenetre = new JFrame();
        
        fenetre.setTitle("Ma première fenêtre Java");

        fenetre.setSize(400, 300);

        fenetre.setLocationRelativeTo(null);

        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JPanel pan = new JPanel();
        //JButton bouton = new JButton("Mon bouton");
        
        //pan.add(bouton);
        //fenetre.setContentPane(pan);

        fenetre.setLayout(new BorderLayout());

        fenetre.getContentPane().add(new JButton("CENTER"), BorderLayout.CENTER);
        fenetre.getContentPane().add(new JButton("NORTH"), BorderLayout.NORTH);
        fenetre.getContentPane().add(new JButton("SOUTH"), BorderLayout.SOUTH);
        fenetre.getContentPane().add(new JButton("WEST"), BorderLayout.WEST);
        fenetre.getContentPane().add(new JButton("EAST"), BorderLayout.EAST);

        fenetre.setVisible(true);    

    }
}
