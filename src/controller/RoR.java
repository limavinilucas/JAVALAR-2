package controller;

import java.awt.Image;

import javax.swing.ImageIcon;

public class RoR extends Planets {

	protected int BugsQntPorPlaneta;
	protected int DevsQntPorPlaneta;
	int AreaPlanetas;
	Impressao impressora = new Impressao();
	ImageIcon Ruby = new ImageIcon(new ImageIcon("Ruby.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));

	public RoR(int posX, int posY, String nome) {
		super(11, 8, "RubyOnRails"); // Padrão de 2 dias (Python);
	}

	{

		setVelocidade(2);
		setCicloAnual(24);
		setDadosDeMovimento(0);
		setTempoRotacao(48);
		setLimiteXMax(11);
		setLimiteXMin(5);
		setLimiteYMax(11);
		setLimiteYMin(5);

	}

	public ImageIcon getIcon(ImageIcon Ruby) {
		return Ruby;
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
		impressora.imprimirMensagens("\nPlaneta: " + nome + "\nA posicao X no instante é: " + posX
				+ "\nA posicao Y no instante é: " + posY + "\nAno " + nome + ": " + cicloAnual / dadosDeMovimento
				+ "\nArea do planeta " + nome + ":" + AreaPlanetas);
		impressora.imprimirApresentacoes(
				"-> Apresentacao: Ruby on Rails é um framework de desenvolvimento web escrito em Ruby.\r\n"
						+ "É conhecido por seguir o princípio  "
						+ "'convenção sobre configuração', o que significa que ele fornece estruturas \n"
						+ "e padrões predefinidos que facilitam o desenvolvimento rápido de aplicativos web.");

	}

}
