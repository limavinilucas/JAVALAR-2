package controller;

public abstract class Celula implements IPosicao {

	protected int posX;
	protected int posY;
	protected String nome;

	public Celula(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public String getNome() {
		return nome;
	}

}
