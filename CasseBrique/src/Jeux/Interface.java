package Jeux;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Interface extends JFrame {
	
	private Panneau pan = new Panneau();

	
	public Interface(){
		Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int)dimension.getHeight();
		int width = (int)dimension.getWidth();
		this.setTitle("Ma première fenêtre Java");
		this.setSize(width, height-50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setContentPane(pan);
		this.setVisible(true);

		go();
	}

	private void go() {
		int x = pan.getPosX(), y = pan.getPosY();
		boolean backX = false;
		boolean backY = false;

		while (true) {
			// Si la coordonnée x est inférieure à 1, on avance
			if (x < 1)
				backX = false;
			// Si la coordonnée x est supérieure à la taille du Panneau moins la taille du rond, on recule
			if (x > pan.getWidth() - 50)
				backX = true;
			// Idem pour l'axe y
			if (y < 1)
				backY = false;
			if (y > pan.getHeight() - 50)
				backY = true;

		    // Si on avance, on incrémente la coordonnée
		    // backX est un booléen, donc !backX revient à écrire
		    // if (backX == false)
		    if (!backX)
		    	pan.setPosX(++x);
		    // Sinon, on décrémente
		    else
		        pan.setPosX(--x);
		    // Idem pour l'axe Y
		    if (!backY)
		        pan.setPosY(++y);
		    else
		        pan.setPosY(--y);
		    // On redessine notre Panneau
		    pan.repaint();
		    // Comme on dit : la pause s'impose ! Ici, trois millièmes de seconde
		    try {
		    	Thread.sleep(3);
		    } catch (InterruptedException e) {
		    	e.printStackTrace();
		    }
	  }
   }
}