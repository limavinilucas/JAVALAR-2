package controller;

import java.awt.Image;

import javax.swing.ImageIcon;

public class JavaScript extends Planets {

	protected int BugsQntPorPlaneta;
	protected int DevsQntPorPlaneta;
	int AreaPlanetas;
	Impressao impressora = new Impressao();
	ImageIcon JavaScript = new ImageIcon(
			new ImageIcon("JavaScript.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
	
	public JavaScript(int posX, int posY, String nome) {
		super(8, 10, "JavaScript"); // Padrão de 0.416 dias Python;
	}
	
	{
		
		setVelocidade(3);
		setCicloAnual(16);
		setDadosDeMovimento(0);
		setTempoRotacao(10);
		setLimiteXMax(10);
		setLimiteXMin(6);
		setLimiteYMax(10);
		setLimiteYMin(6);
		
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
		impressora.imprimirApresentacoes("-> Apresentacao:\nJavaScript é uma linguagem de programação de alto nível usada,\nprincipalmente para desenvolvimento web.\r\n"
				+ "É a linguagem de script dos navegadores da web e\né usada para criar interações dinâmicas em páginas da web.");
		
	}
	

}
