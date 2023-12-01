package controller;

import java.awt.Image;

import javax.swing.ImageIcon;

public class PHP extends Planets {

	protected int BugsQntPorPlaneta;
	protected int DevsQntPorPlaneta;
	int AreaPlanetas;
	Impressao impressora = new Impressao();
	ImageIcon PHP = new ImageIcon(
			new ImageIcon("php.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
	
	public PHP(int posX, int posY, String nome) {
		super(8, 12, "PHP"); // Padrão de 2.5 dias Python;
	}
	
	{
		
		setVelocidade(2);
		setCicloAnual(32);
		setDadosDeMovimento(0);
		setTempoRotacao(60);
		setLimiteXMax(12);
		setLimiteXMin(4);
		setLimiteYMax(12);
		setLimiteYMin(4);

	}
	
	public ImageIcon getIcon(ImageIcon PHP) {
		return PHP;
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
		impressora.imprimirApresentacoes("-> Apresentacao:\nPHP é uma linguagem de script usada principalmente para desenvolvimento web do lado do servidor.\r\n"
				+ "É amplamente usado para criar sites dinâmicos e aplicativos web,"
				+ "\nespecialmente em combinação com bancos de dados MySQL.");
	}


}
