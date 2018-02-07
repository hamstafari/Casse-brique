package Jeux;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Brick extends Panneau {

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
    
    public final void setCouleurEtRes() {
    	
    	 Color couleurbr=getCouleur();
    	
    	int aleatoire =(int) (Math.random() * 4 );
    	
		switch(aleatoire) {
		default:
			this.couleur = Color.red;
			this.resistance=1;
			break;
		case 2:
			this.couleur = Color.green.darker();
			this.resistance=2;
			break;
		case 3:
			this.couleur = Color.blue;
			this.resistance=3;
			break;
		}
        couleurbr = couleur;
    }

    public final int getResistance() {
        return resistance;
    }

    public final int getHauteur() {
        return hauteur;
    }

    public final int getLongueur() {
        return longueur;
    }
    
    public void drawBrick(Graphics g) {
    	
    	g=getGraphics();
    	
    	ArrayList al = new ArrayList();
    	 for (int ligne = this.getHeight()/10; ligne < this.getHeight()/5*3; ligne += 50) {
	        	for (int colonne = this.getWidth()/20; colonne < this.getWidth()/20*19; colonne += 50) {
	        		Brick br = new Brick(35,10);
	        		br.setCouleurEtRes();
	        		al.add(br);
	        		g.fillRect(colonne, ligne, br.getHauteur(), br.getLongueur());
	        		g.setColor(br.getCouleur());
    	
    	
    }
    	 }
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
