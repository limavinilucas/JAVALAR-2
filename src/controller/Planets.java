package controller;

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Planets extends Celula {

	public String nome;
	public int veloTranslacao;
	public int tempo;
	public double veloMedia;
	public int veloRotacao;
	public int posY;
	public int posX;
	public int limiteYMax;
	public int limiteXMax;
	public int limiteYMin;
	public int limiteXMin;
	public int BugsQntPorPlaneta;
	public int DevsQntPorPlaneta;
	public double anos;
	public double dias;
	public int AreaPlanetas;
	public double dadosDeMovimento;
	public int cicloAnual; // Quantidade de movimentos que o planeta realiza para completar 1 ano
	public double tempoRotacao; // Tempo Rotacao é mensurado em horas Terrestres (chamemos de horasM)
	public int[][] movimentos = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
	public int direcaoMovimento = 0;
	Impressao impressora = new Impressao();
	public ImageIcon Icon;
	ImageIcon JAVA =
			new ImageIcon(new ImageIcon("JAVA.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
	ImageIcon JavaScript =
			new ImageIcon(new ImageIcon("JavaScript.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
	ImageIcon Python = 
			new ImageIcon(new ImageIcon("Python.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
	ImageIcon Ruby = 
			new ImageIcon(new ImageIcon("Ruby.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
	ImageIcon PHP =
			new ImageIcon(new ImageIcon("php.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
	ImageIcon Csharp = 
			new ImageIcon(new ImageIcon("Csharp.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
	ImageIcon Cplus = 
			new ImageIcon(new ImageIcon("Cmaismais.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
	ImageIcon C = 
			new ImageIcon(new ImageIcon("Clanguage.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
	ArrayList<ImageIcon> imagensPlanetas = new ArrayList<ImageIcon>();
	
	
	// Contrutor 
	public Planets(int posX, int posY, String nome) {
		super(posX, posY);
		this.nome = nome;
	}
	
	public double getDias() {
		return dias;
	}
	
	public void setDias(double dias) {
		this.dias = dias;
	}
	
	public double getAnos() {
		return anos;
	}
	
	public void setAnos(double anos) {
		this.anos = anos;
	}
	
	public int getBugsQntPorPlaneta() {
		return BugsQntPorPlaneta;
	}
	
	public void setBugsQntPorPlaneta(int bugsQntPorPlaneta) {
		BugsQntPorPlaneta = bugsQntPorPlaneta;
	}

	public int getDevsQntPorPlaneta() {
		return DevsQntPorPlaneta;
	}

	public double getVeloMedia() {
		return veloMedia;
	}

	public void setVeloMedia(double veloMedia) {
		this.veloMedia = veloMedia;
	}

	public int getAreaPlanetas() {
		return AreaPlanetas;
	}

	public void setAreaPlanetas(int areaPlanetas) {
		AreaPlanetas = areaPlanetas;
	}

	public int getDirecaoMovimento() {
		return direcaoMovimento;
	}

	public void setDirecaoMovimento(int direcaoMovimento) {
		this.direcaoMovimento = direcaoMovimento;
	}

	public ImageIcon getIcon() {
		return Icon;
	}

	public void setIcon(ImageIcon icon) {
		Icon = icon;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public void setDevsQntPorPlaneta(int devsQntPorPlaneta) {
		DevsQntPorPlaneta = devsQntPorPlaneta;
	}

	public double getTempo() {
		return tempoRotacao;
	}
	
	public int getVelocidade() {
		return veloTranslacao;
	}
	
	public void setVelocidade(int veloTranslacao) {
		this.veloTranslacao = veloTranslacao;
	}
	public double getTempoRotacao() {
		return tempoRotacao;
	}
	
	public void setTempoRotacao(double tempoRotacao) {
		this.tempoRotacao = tempoRotacao;
	}
	
	public int getPosX() {
		return posX;
	}
	
	public int getVeloTranslacao() {
		return veloTranslacao;
	}

	public void setVeloTranslacao(int veloTranslacao) {
		this.veloTranslacao = veloTranslacao;
	}

	public int getVeloRotacao() {
		return veloRotacao;
	}

	public void setVeloRotacao(int veloRotacao) {
		this.veloRotacao = veloRotacao;
	}

	public int getLimiteYMax() {
		return limiteYMax;
	}

	public void setLimiteYMax(int limiteYMax) {
		this.limiteYMax = limiteYMax;
	}

	public int getLimiteXMax() {
		return limiteXMax;
	}

	public void setLimiteXMax(int limiteXMax) {
		this.limiteXMax = limiteXMax;
	}

	public int getLimiteYMin() {
		return limiteYMin;
	}

	public void setLimiteYMin(int limiteYMin) {
		this.limiteYMin = limiteYMin;
	}

	public int getLimiteXMin() {
		return limiteXMin;
	}

	public void setLimiteXMin(int limiteXMin) {
		this.limiteXMin = limiteXMin;
	}

	public double getDadosDeMovimento() {
		return dadosDeMovimento;
	}

	public void setDadosDeMovimento(double dadosDeMovimento) {
		this.dadosDeMovimento = dadosDeMovimento;
	}

	public int getCicloAnual() {
		return cicloAnual;
	}

	public void setCicloAnual(int cicloAnual) {
		this.cicloAnual = cicloAnual;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public ImageIcon getIcon(ImageIcon imagensPlanetas) {
		
		return imagensPlanetas;
		
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
		impressora.imprimirMensagens("\nPlaneta: " + nome +
				"\nA posicao X no instante é: " + posX +
				"\nA posicao Y no instante é: " + posY +
				"\nAno " + nome + ": " + dadosDeMovimento / cicloAnual +
				"\nArea do planeta " + nome + ":" + AreaPlanetas);			
	}
	
	
	

}