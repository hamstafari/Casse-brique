package Jeux;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.util.ArrayList;

import javax.swing.JPanel;

 
public class Panneau extends JPanel {
	private int posX = -50;
	private int posY = -50;
	
	public void paintComponent(Graphics g){
		//Fond noir
        g.setColor(Color.black);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        ArrayList al = new ArrayList();
        
        	
        for (int d = this.getHeight()/10; d < this.getHeight()/5*3; d += 50) {
        	for (int t = this.getWidth()/20; t < this.getWidth()/20*19; t += 50) {
        		
        		
        		Brick br = new Brick(35,10);
        		br.setCouleur(Color.red);
        		
        		al.add(br);
        	}
        	}
      
      //Cercle rouge
        g.setColor(Color.red);
        g.fillOval(posX, posY, 13, 13);
		joueur1(g,this.posSourisX());
      }
	
	
	public static int posSourisX() {
		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		int x = (int) b.getX();
		System.out.println(x);
		return x;
	}
	
	public void joueur1(Graphics g,int x) {
		g.setColor(Color.white);
		g.fillRect(x,this.getHeight()-25,90,7);
		g.drawRect(x,this.getHeight()-25,90,7);
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