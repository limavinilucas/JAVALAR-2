package view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LabelsControl extends JLabel {

	private int posX;
	private int posY;
	private Color cores;

	public void posicoesPlano() {
		this.posX = posX;
		this.posY = posY;
		this.cores = cores;
	}

	private void getPosX() {
		this.posX = posX;
	}

	private void getPosY() {
		this.posY = posY;
	}

	private void getCores() {
		this.cores = cores;
	}
	
	ImageIcon JavaScript = new ImageIcon(
			new ImageIcon("JavaScript.png").getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH));
	ImageIcon Python = new ImageIcon(
			new ImageIcon("Python.png").getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH));
	ImageIcon Ruby = new ImageIcon(
			new ImageIcon("Ruby.png").getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH));
	ImageIcon PHP = new ImageIcon(
			new ImageIcon("php.png").getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH));
	ImageIcon Csharp = new ImageIcon(
			new ImageIcon("Csharp.png").getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH));
	ImageIcon Cmaismais = new ImageIcon(
			new ImageIcon("Cmaismais.png").getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH));
	ImageIcon Clanguage = new ImageIcon(
			new ImageIcon("Clanguage.png").getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH));
	ImageIcon DEVs = new ImageIcon(
			new ImageIcon("bug.png").getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH));
	ImageIcon BUGs = new ImageIcon(
			new ImageIcon("DEV.png").getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH));

	
}
