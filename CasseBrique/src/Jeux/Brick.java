package Jeux;

import java.awt.Color;
import java.awt.Graphics;

public class Brick {

    private final int hauteur;
    private final int longueur;
    private Color couleur;
    private int resistance;

    public Brick(int hauteur, int longueur) {
        super();
        this.hauteur = hauteur;
        this.longueur = longueur;
    }

    public final Color getCouleur() {
        return couleur;
    }
    
    public final void setCouleur(Color couleur) {
    	
    	int aleatoire =(int) (Math.random() * 4 );
    	
		switch(aleatoire) {
		default:
			this.couleur = Color.red;
			break;
		case 2:
			this.couleur = Color.green.darker();
			break;
		case 3:
			this.couleur = Color.blue;
			break;
		}
    	
        this.couleur = couleur;
    }

    public final int getResistance() {
        return resistance;
    }

    public final void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public final int getHauteur() {
        return hauteur;
    }

    public final int getLongueur() {
        return longueur;
    }

}


/*public class Brick extends Panneau {

	public void paintBrick(Graphics g){

	int resistance;
		for (int d = getHeight()/10; d < this.getHeight()/5*3; d += 50) {
			for (int t = this.getWidth()/20; t < this.getWidth()/20*19; t += 50) {
				
				int aleatoire =(int) (Math.random() * 4 );
				
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
		g.fillRect(t, d, 35, 10);
		
	}
			
}
		
		
}
	
	
	
}*/
