package Jeux;

import java.awt.Color;
import java.util.Random;

/**
 * The Class which defined Brick.
 */
/**
 * @author Ham
 *
 */
public class Brick {

	/** The hauteur member for height. */
	private final int hauteur;

	/** The longueur member for long. */
	private final int longueur;

	/** The parameters for brick. */
	private final BrickParam params;

	/**
	 * Instantiates a new brick.
	 *
	 * @param hauteur
	 *            the height as {@link Integer}
	 * @param longueur
	 *            the long as {@link Integer}
	 */
	public Brick(int hauteur, int longueur) {
		super();
		this.hauteur = hauteur;
		this.longueur = longueur;
		params = new BrickParam();
	}

	/**
	 * Sets the default parameters for color and strength.
	 */
	public final void setCouleurEtRes() {

		final Random randGen = new Random();
		final int aleatoire = randGen.nextInt(5);

		switch (aleatoire) {

		case 0:
		case 1:
		default:
			params.setCouleur(Color.red);
			params.setResistance(1);
			break;
		case 2:
			params.setCouleur(Color.green.darker());
			params.setResistance(2);
			break;
		case 3:
			params.setCouleur(Color.blue);
			params.setResistance(3);
			break;
		}
	}

	/**
	 * Gets the resistance.
	 *
	 * @return the resistance as {@link Integer}
	 */
	public final int getResistance() {
		int res = 0;
		if (params != null) {
			res = params.getResistance();
		}
		return res;

	}

	/**
	 * Gets the color.
	 *
	 * @return the color as {@link Color}
	 */
	public final Color getColor() {
		Color col = Color.BLACK;
		if (params != null) {
			col = params.getCouleur();
		}
		return col;

	}

	/**
	 * Gets the height.
	 *
	 * @return the height as {@link Integer}
	 */
	public final int getHauteur() {
		return hauteur;
	}

	/**
	 * Gets the long.
	 *
	 * @return the long as {@link Integer}
	 */
	public final int getLongueur() {
		return longueur;
	}

	/**
	 * Gets the parameters of the brick (color and strength).
	 *
	 * @return the params as {@link BrickParam}
	 */
	public final BrickParam getParams() {
		return params;
	}

}
