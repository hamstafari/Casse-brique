package Jeux;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
 
public class Panneau extends JPanel {
	
	public void Initialisation() {
		paintComponent(null);
		System.out.println();
	}
	
	public void paintComponent(Graphics g){
		int resistance = 0;
        for (int d = this.getHeight()/10; d < this.getHeight()/5*4; d += 50) {
        	for (int t = this.getWidth()/20; t < this.getWidth()/20*19; t += 50) {
				int aleatoire =(int) (Math.random() * 4 );
				System.out.println(aleatoire);
				switch(aleatoire) {
				default:
					g.setColor(Color.red);
					resistance = 1;
					break;
				case 2:
					g.setColor(Color.green.darker());
					resistance = 2;
					break;
				case 3:
					g.setColor(Color.blue);
					resistance = 3;
					break;
				}
				
				g.fillRect(t, d, 25, 10);
        	}
        }
	}               
}