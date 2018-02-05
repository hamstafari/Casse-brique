package Jeux;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Interface extends JFrame {
	
  public Interface(){    
	//Récupère taille de l'écran
	Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
	int height = (int)dimension.getHeight();
	int width = (int)dimension.getWidth();
    this.setTitle("Ma première fenêtre Java");
    this.setSize(width, height-50);
    this.setLocationRelativeTo(null);         
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBackground(Color.black);
    this.setContentPane(new Panneau());
    this.setResizable(false);
    this.setVisible(true);
  }  
}