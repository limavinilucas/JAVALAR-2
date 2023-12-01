package controller;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Csharp extends Planets {

	protected int BugsQntPorPlaneta;
	protected int DevsQntPorPlaneta;
	int AreaPlanetas;
	Impressao impressora = new Impressao();
	ImageIcon Csharp = new ImageIcon(
			new ImageIcon("Csharp.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
	
	public Csharp(int posX, int posY, String nome) {
		super(8, 13, "C#"); // Padrão de 0.166 (aproximadamente) dias Python.
	}
	
	{

		setVelocidade(1);
		setCicloAnual(40);
		setDadosDeMovimento(0);
		setTempoRotacao(4);
		setLimiteXMax(13);
		setLimiteXMin(3);
		setLimiteYMax(13);
		setLimiteYMin(3);

	}
	
	public ImageIcon getIcon(ImageIcon Csharp) {
		return Csharp;
	}
	
	public void movimentarGeral(double tempo) {
		for (int i = 0; i < tempo; i++) {
			posX += movimentos[direcaoMovimento][0];
			posY += movimentos[direcaoMovimento][1];

			if (posX > limiteXMax) {
				posX = limiteXMax;
				direcaoMovimento = (direcaoMovimento + 1) % 4; // Muda a direção para baixo
				dadosDeMovimento = dadosDeMovimento + 1;
			} else if (posX < limiteXMin) {
				posX = limiteXMin;
				direcaoMovimento = (direcaoMovimento + 1) % 4; // Muda a direção para cima
				dadosDeMovimento = dadosDeMovimento + 1;
			}

			if (posY > limiteYMax) {
				posY = limiteYMax;
				direcaoMovimento = (direcaoMovimento + 1) % 4; // Muda a direção para esquerda
				dadosDeMovimento = dadosDeMovimento + 1;
			} else if (posY < limiteYMin) {
				posY = limiteYMin;
				direcaoMovimento = (direcaoMovimento + 1) % 4; // Muda a direção para direita
				dadosDeMovimento = dadosDeMovimento + 1;
			}
		}
		setPosX(posX);
		setPosY(posY);
		AreaPlanetas = posX * posY;
		impressora.imprimirMensagens("\nPlaneta: " + nome +
				"\nA posicao X no instante é: " + posX +
				"\nA posicao Y no instante é: " + posY +
				"\nAno " + nome + ": " + cicloAnual / dadosDeMovimento +
				"\nArea do planeta " + nome + ":" + AreaPlanetas);
		impressora.imprimirApresentacoes("-> Apresentacao:\nC# é uma linguagem de programação desenvolvida pela Microsoft.\r\n"
				+ "É frequentemente usada para criar aplicativos Windows e jogos com a plataforma Unity.");
	}

}
