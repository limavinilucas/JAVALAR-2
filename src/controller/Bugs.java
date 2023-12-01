package controller;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Bugs extends Celula {
	
	public Bugs(int posX, int posY) {
		super(posX, posY);
	}
	
	ImageIcon BUG = new ImageIcon(
			new ImageIcon("bug.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
	
	public ImageIcon getIcon(ImageIcon BUG) {
		return BUG;
	}
	
	public int getPosX() {
		return posX;
	}
	
	public int getPosY() {
		return posY;
	}
	
}
