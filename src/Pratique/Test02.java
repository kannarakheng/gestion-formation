package Pratique;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Test02 extends JPanel 
{
    public void paintComponent (Graphics g)
    {
        Graphics2D g2d = (Graphics2D)g;
        GradientPaint gp = new GradientPaint(0, 0, Color.RED, 30, 30, Color.cyan, true);
        g2.setPaint(gp);
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
       
    }
}
