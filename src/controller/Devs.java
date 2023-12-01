package controller;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Devs extends Celula {
	
	public Devs(int posX, int posY) {
		super(posX, posY);
	}
	
	ImageIcon DEV = new ImageIcon(
			new ImageIcon("DEV.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
	
	public ImageIcon getIcon(ImageIcon DEV) {
		return DEV;
	}
	
	public int getPosX() {
		return posX;
	}
	
	public int getPosY() {
		return posY;
	}
	
	
}
