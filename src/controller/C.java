package controller;

import java.awt.Image;

import javax.swing.ImageIcon;

public class C extends Planets {

	protected int BugsQntPorPlaneta;
	protected int DevsQntPorPlaneta;
	int AreaPlanetas;
	double dadosDeMovimento;
	int cicloAnual = 56;
	Impressao impressora = new Impressao();
	ImageIcon Clanguage = new ImageIcon(
			new ImageIcon("Clanguage.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
	
	public C(int posX, int posY, String nome) {
		super(8, 15, "C"); // Padrão de 0.0416 dias Python.
	}

	{

		setVelocidade(10);
		setCicloAnual(56);
		setDadosDeMovimento(0);
		setTempoRotacao(0.1);
		setLimiteXMax(15);
		setLimiteXMin(1);
		setLimiteYMax(15);
		setLimiteYMin(1);

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
		impressora.imprimirApresentacoes("-> Apresentacao:\nC é uma linguagem de programação de baixo nível e procedural.\r\n"
				+ "É frequentemente usado no desenvolvimento de sistemas operacionais, drivers de dispositivo e"
				+ "\nsoftwares de baixo nível devido à sua eficiência e controle direto sobre o hardware.");
	}

}
