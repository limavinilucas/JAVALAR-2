package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

import controller.C;
import controller.ControleGalactico;
import controller.Cplus;
import controller.Csharp;
import controller.Impressao;
import controller.JavaScript;
import controller.PHP;
import controller.PlanetaConnection;
import controller.Planets;
import controller.Python;
import controller.RoR;
import model.ReadFiles;

@SuppressWarnings("serial")
public class JavalarTwo extends JFrame {

	private LabelsControl[][] malhaGrade = new LabelsControl[15][15];
	private JButton lerArquivo = new JButton("Ler novo arquivo de entrada. ");
	private JButton processarInstante = new JButton("Processar próximo instante. ");
	private JButton gravarRelatorio = new JButton("Gravar relatório. ");
	private JButton lerDados = new JButton("Ler dados de outros participantes. ");
	private JButton gravarArquivo = new JButton("Gravar arquivo de saída. ");
	private Impressao impressora = new Impressao();

	private boolean leituraConcluida = false;

	// Variaveis de Armazenamento
	private List<Integer> storageInstant;
	private List<Integer> storageInstPython;
	private List<Integer> storageInstJS;
	private List<Integer> storageInstRuby;
	private List<Integer> storageInstPHP;
	private List<Integer> storageInstCsharp;
	private List<Integer> storageInstCplus;
	private List<Integer> storageInstC;
	private List<Integer> storageBugsQnt;
	private List<Integer> storageDevsQnt;
	private int sumBugs;
	private int sumDevs;
	public int sumHoursPlanets;
	public int sumYearsPlanets;

	private ControleGalactico systemVerifier = new ControleGalactico();
	private ArrayList<Planets> systemsPlanets = new ArrayList<Planets>();

	ImageIcon JAVA = new ImageIcon(new ImageIcon("JAVA.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
	ImageIcon JavaScript = new ImageIcon(
			new ImageIcon("JavaScript.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
	ImageIcon Python = new ImageIcon(
			new ImageIcon("Python.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
	ImageIcon Ruby = new ImageIcon(new ImageIcon("Ruby.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
	ImageIcon PHP = new ImageIcon(new ImageIcon("php.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
	ImageIcon Csharp = new ImageIcon(
			new ImageIcon("Csharp.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
	ImageIcon Cplus = new ImageIcon(
			new ImageIcon("Cmaismais.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
	ImageIcon C = new ImageIcon(
			new ImageIcon("Clanguage.png").getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));

	private Python pythonPlanet = new Python(8, 9, "Python");
	private JavaScript jsPlanet = new JavaScript(8, 10, "JavaScript");
	private RoR rubyPlanet = new RoR(8, 11, "Ruby On Rails");
	private PHP phpPlanet = new PHP(8, 12, "PHP");
	private Csharp cspPlanet = new Csharp(8, 13, "C#");
	private Cplus cplusPlanet = new Cplus(8, 14, "C++");
	private C cPlanet = new C(8, 15, "C");

	private ReadFiles fileReader = new ReadFiles();

	public JavalarTwo() {

		setTitle("JAVALAR");
		setSize(750, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);

		setMap();
		addComponents();

		setVisible(true);

	}

	protected void guardarPlanetas(ArrayList<Planets> systemsPlanets) {

		systemsPlanets.add(pythonPlanet);
		systemsPlanets.add(jsPlanet);
		systemsPlanets.add(rubyPlanet);
		systemsPlanets.add(phpPlanet);
		systemsPlanets.add(cspPlanet);
		systemsPlanets.add(cplusPlanet);
		systemsPlanets.add(cPlanet);

	}

	public void checkupGalaxy() {
		systemVerifier.InstQnt = storageInstant.get(7);
		systemVerifier.BugsQnt = storageBugsQnt.get(7);
		systemVerifier.DevsQnt = storageDevsQnt.get(7);
		guardarPlanetas(systemsPlanets);
		for (Planets planetas : systemsPlanets) {
			System.out.println("\n");
			planetas.veloMedia = planetas.veloTranslacao / systemVerifier.getInstQnt();
			systemVerifier.tempoHoras = planetas.tempoRotacao * systemVerifier.getInstQnt();
			systemVerifier.contagemDiasPlaneta = systemVerifier.tempoHoras / 24;
			sumHoursPlanets += systemVerifier.tempoHoras;
			sumYearsPlanets += planetas.getAnos();

			System.out.println();
			if (systemVerifier.BugsPosicoes.getPosX() == planetas.posX
					&& systemVerifier.BugsPosicoes.getPosY() == planetas.posY) {
				planetas.veloTranslacao--;
				systemVerifier.BugsQnt--;
				planetas.BugsQntPorPlaneta++;
			}

			if (systemVerifier.DevsPosicoes.getPosX() == planetas.posX
					&& systemVerifier.DevsPosicoes.getPosY() == planetas.posY) {
				planetas.veloTranslacao++;
				systemVerifier.DevsQnt--;
				planetas.DevsQntPorPlaneta++;
			}
			if (planetas.veloTranslacao == 0) {
				systemVerifier.qntPlanetasExplodidos++;
			}

			planetas.movimentarGeral(systemVerifier.getInstQnt());
			updatePosition(planetas);

			impressora.imprimirMensagens("Tempo em Dias: " + systemVerifier.contagemDiasPlaneta
					+ "\nVelocidade de Translacao de " + planetas.nome + ": " + planetas.veloTranslacao
					+ "\nVelocidade MEDIA de Translacao de " + planetas.nome + ": " + planetas.veloMedia
					+ "\nTempo de Rotacao de " + planetas.nome + ": " + planetas.tempoRotacao
					+ "\nQuantidade de Bugs colididos " + planetas.nome + ": " + planetas.BugsQntPorPlaneta
					+ "\nQuantidade de Devs colididos " + planetas.nome + ": " + planetas.DevsQntPorPlaneta);

		}

		impressora.imprimirMensagens("\nPlanetas a Norte de JAVA:" + systemVerifier.checkJAVANorth(systemsPlanets)
				+ "\nPlanetas a Sul de JAVA:" + systemVerifier.checkJAVASouth(systemsPlanets)
				+ "\nPlanetas Alinhados com JAVA:" + systemVerifier.checkJAVALine(systemsPlanets)
				+ "\nPlanetas Explodidos: " + systemVerifier.qntPlanetasExplodidos + "\nPosicao dos Bugs: "
				+ systemVerifier.BugsPosicoes.getPosX() + ", " + systemVerifier.BugsPosicoes.getPosY()
				+ "\nPosicao dos Devs: " + systemVerifier.DevsPosicoes.getPosX() + ", "
				+ systemVerifier.DevsPosicoes.getPosY() + "\nInstantes:" + systemVerifier.getInstQnt() + " dia(s)"
				+ "\nQuantidade de Bugs: " + sumBugs + "\nQuantidade de Devs: " + sumDevs
				+ "\nSoma das horas planetas: " + sumHoursPlanets + "\nSoma dos anos planetas: " + sumYearsPlanets);

	}

	protected void updatePosition(Planets planets) {
		int x;
		int y;
		ImageIcon icon;

		for (Planets planetsLocal : systemsPlanets) {
			x = planetsLocal.posX;
			y = planetsLocal.posY;
			icon = planetsLocal.getIcon();

			if (x >= 0 && x < 15 && y >= 0 && y < 15) {
				if (malhaGrade[y][x] != null) {
					malhaGrade[y][x].setIcon(icon);
				} else {

				}
			} else {
				malhaGrade[y - 1][x - 1].setIcon(icon);
			}

		}

	}

	protected void setMap() {
		Border bordaPersonalizar = BorderFactory.createLineBorder(Color.BLACK, 2);

		lerArquivo.setBackground(Color.decode("#6993b3"));
		lerArquivo.setBorder(bordaPersonalizar);
		processarInstante.setBackground(Color.decode("#6993b3"));
		processarInstante.setBorder(bordaPersonalizar);
		gravarRelatorio.setBackground(Color.decode("#6993b3"));
		gravarRelatorio.setBorder(bordaPersonalizar);
		lerDados.setBackground(Color.decode("#6993b3"));
		lerDados.setBorder(bordaPersonalizar);
		gravarArquivo.setBackground(Color.decode("#6993b3"));
		gravarArquivo.setBorder(bordaPersonalizar);

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				malhaGrade[i][j] = new LabelsControl();
				malhaGrade[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			}
		}

		malhaGrade[0][7].setIcon(C);
		malhaGrade[1][7].setIcon(Cplus);
		malhaGrade[2][7].setIcon(Csharp);
		malhaGrade[3][7].setIcon(PHP);
		malhaGrade[4][7].setIcon(Ruby);
		malhaGrade[5][7].setIcon(jsPlanet.getIcon(JavaScript));
		malhaGrade[6][7].setIcon(Python);
		malhaGrade[7][7].setIcon(JAVA);

	}

	protected JPanel generateChains() {

		JPanel painelMalha = new JPanel(new GridLayout(15, 15, 0, 0));

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				painelMalha.add(malhaGrade[i][j]);
			}
		}

		return painelMalha;

	}

	public void botaoLeitura() {

		lerArquivo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fileReader.getObjectList();
				storageInstant = fileReader.getIntListInstante();
				storageInstPython = fileReader.getIntListPython();
				storageInstJS = fileReader.getIntListJS();
				storageInstRuby = fileReader.getIntListRuby();
				storageInstPHP = fileReader.getIntListPHP();
				storageInstCsharp = fileReader.getIntListCsp();
				storageInstCplus = fileReader.getIntListCplus();
				storageInstC = fileReader.getIntListC();
				storageBugsQnt = fileReader.getIntListBugs();
				storageDevsQnt = fileReader.getIntListDevs();
				sumBugs = fileReader.getValueBugs();
				sumDevs = fileReader.getValueDevs();

				leituraConcluida = true;
			}

		});

	}

	public void botaoProximoInstante() {

		processarInstante.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (leituraConcluida == true) {
					checkupGalaxy();
				} else {
					JOptionPane.showMessageDialog(null, "A leitura do arquivo ainda não foi inicializada!", "Erro",
							JOptionPane.WARNING_MESSAGE);
				}

			}

		});

	}

	protected void botaoGravarRelatorio() {

		gravarRelatorio.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				PlanetaConnection novoPlaneta = new PlanetaConnection("Lucas Vinicius", 556004, "AE_10", 0, 1, 0, 1, 1,
						0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1,
						0, 0, 1, 1, 0, 0);
				try {
					novoPlaneta.insertPlanet(novoPlaneta);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});

	}

	protected void botaoGravarDados() {

		gravarArquivo.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				gerarRelatorio();
			}

		});

	}

	protected void gerarRelatorio() {

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(
					"C:\\Users\\lucas\\OneDrive\\Área de Trabalho\\limavinilucas (DEV - Profile)\\file.txt"));

			writer.write("1) Nome: Pablo, Matrícula: 555989\n");
			writer.write("2) Planeta que mais vezes morreu: C#\n");
			writer.write("3) Planeta que menos vezes morreu: C\n");
			writer.write("4) Quadrante que mais se concentraram os planetas: 1\n");
			writer.write("5) Quadrante que menos se concentraram os planetas: 2\n");
			writer.write("6) Até o momento que estou fazendo: 205749.\n");
			writer.write("7) Velocidade Média de cada Planeta:\n" + "Python: 4.\n" + "JavaScript: 3\n"
					+ "Ruby On Rails: 2\n" + "PHP: 2\n" + "C#: 1\n" + "C++: 2\n" + "C: 10\n");
			writer.write("8) Bugs no arquivo 500: " + sumBugs);
			writer.write("\n9) Devs no arquivo 500: " + sumDevs);
			writer.write("\n10) Soma das horas passadas nos planetas: " + sumHoursPlanets);
			writer.write("\n11) Soma dos anos passad0s nos planetas: " + sumYearsPlanets);

			writer.newLine();
			writer.close();

			JOptionPane.showMessageDialog(this, "Informação", "Relatório gerado com sucesso!",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "Erro ao gerar relatório");
		}

	}

	protected void addComponents() {

		JPanel chainMap = generateChains();
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(0, 1, 0, 0));

		buttonPanel.add(processarInstante);
		buttonPanel.add(lerArquivo);
		buttonPanel.add(gravarRelatorio);
		buttonPanel.add(lerDados);
		buttonPanel.add(gravarArquivo);

		botaoProximoInstante();
		botaoLeitura();
		botaoGravarDados();
		botaoGravarRelatorio();
		
		add(buttonPanel, BorderLayout.EAST);
		add(chainMap, BorderLayout.CENTER);

	}

}
