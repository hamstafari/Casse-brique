package Jeux;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
	private int posX = -50;
	private int posY = -50;
	
	public void paintComponent(Graphics g){
		//Fond noir
        g.setColor(Color.black);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

      //Cercle rouge
        g.setColor(Color.red);
        g.fillOval(posX, posY, 13, 13);
		joueur1(g,this.posSourisX());
      }

	
	public int posSourisX() {

		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		int x = (int) b.getX();
		return x;
	}
	
	public void joueur1(Graphics g,int x) {
		g.setColor(Color.white);
		g.fillRect(x,this.getHeight()-25,90,7);
	}

      public int getPosX() {
        return posX;
      }

      public void setPosX(int posX) {
        this.posX = posX;
      }

      public int getPosY() {
        return posY;
      }

      public void setPosY(int posY) {
        this.posY = posY;
      }
	
}