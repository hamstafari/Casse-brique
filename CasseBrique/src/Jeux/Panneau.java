package Jeux;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
 
public class Panneau extends JPanel {
  public void paintComponent(Graphics g){
		int resistance = 0;
		g.drawRect(10, 10, 10, 50);
		int aleatoire =(int) (Math.random() * 3 );
		switch(aleatoire) {
		case 1:
			g.setColor(Color.red);
			resistance = 1;
		case 2:
			g.setColor(Color.green);
			resistance = 2;
		case 3:
			g.setColor(Color.blue);
			resistance = 3;
		}
  }               
}