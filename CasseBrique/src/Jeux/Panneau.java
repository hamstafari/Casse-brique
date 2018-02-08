package Jeux;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class Panneau extends JPanel {
	private int posX = -50;
	private int posY = -50;

	@Override
	public void paintComponent(Graphics g) {
		// Fond noir
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());

		// Cercle rouge
		g.setColor(Color.red);
		g.fillOval(posX, posY, 13, 13);
		joueur1(g, posSourisX());
	}

	public int posSourisX() {

		final PointerInfo a = MouseInfo.getPointerInfo();
		final Point b = a.getLocation();
		final int x = (int) b.getX();
		return x;
	}

	public void joueur1(Graphics g, int x) {
		g.setColor(Color.white);
		g.fillRect(x, getHeight() - 25, 90, 7);
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

	/**
	 * Draw brick.
	 *
	 * @param g
	 *            the g
	 */
	public void drawBrick(Graphics g) {

		g = getGraphics();

		final List<Brick> al = new ArrayList<>();
		for (int ligne = getHeight() / 10; ligne < getHeight() / 5 * 3; ligne += 50) {
			for (int colonne = getWidth() / 20; colonne < getWidth() / 20 * 19; colonne += 50) {
				final Brick br = new Brick(35, 10);
				br.setCouleurEtRes();
				al.add(br);
				g.fillRect(colonne, ligne, br.getHauteur(), br.getLongueur());
				g.setColor(br.getColor());
			}
		}
	}

}