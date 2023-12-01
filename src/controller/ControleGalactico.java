package controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ControleGalactico {
	
	public Random randomSeed = new Random();
	public Scanner generalScan = new Scanner(System.in);
	public Impressao impressora = new Impressao();
	public int qntPlanetasExplodidos;
	public int InstQnt;
	public int BugsQnt;
	public int DevsQnt;
	public double tempoHoras;
	public double contagemDiasPlaneta;
//	public PlanetsActions actions = new PlanetsActions();
	public Bugs BugsPosicoes = new Bugs(randomSeed.nextInt(15) + 1, randomSeed.nextInt(15) + 1);
	public Devs DevsPosicoes = new Devs(randomSeed.nextInt(15) + 1, randomSeed.nextInt(15) + 1);
	public ArrayList<Planets> systemsPlanet = new ArrayList<Planets>();
	public ArrayList<Bugs> bugsList = new ArrayList<Bugs>();
	public ArrayList<Devs> devsList = new ArrayList<Devs>();

	public void guardarPlanetas(ArrayList<Planets> systemsPlanet) {

		systemsPlanet.add(new Python(8, 9, "Python"));
		systemsPlanet.add(new JavaScript(8, 10, "JavaScript"));
		systemsPlanet.add(new RoR(8, 11, "Ruby On Rails"));
		systemsPlanet.add(new PHP(8, 12, "PHP"));
		systemsPlanet.add(new Csharp(8, 13, "C#"));
		systemsPlanet.add(new Cplus(8, 14, "C++"));
		systemsPlanet.add(new C(8, 15, "C"));

	}

	public int getQntPlanetasExplodidos() {
		return qntPlanetasExplodidos;
	}

	public void setQntPlanetasExplodidos(int qntPlanetasExplodidos) {
		this.qntPlanetasExplodidos = qntPlanetasExplodidos;
	}

	public int getInstQnt() {
		return InstQnt;
	}

	public void setInstQnt(int instQnt) {
		InstQnt = instQnt;
	}

	public int getBugsQnt() {
		return BugsQnt;
	}

	public void setBugsQnt(int bugsQnt) {
		BugsQnt = bugsQnt;
	}

	public int getDevsQnt() {
		return DevsQnt;
	}

	public void setDevsQnt(int devsQnt) {
		DevsQnt = devsQnt;
	}

	public double getContagemDiasPlaneta() {
		return contagemDiasPlaneta;
	}

	public void setContagemDiasPlaneta(double contagemDiasPlaneta) {
		this.contagemDiasPlaneta = contagemDiasPlaneta;
	}

	public int checkJAVANorth(ArrayList<Planets> systemsPlanets) {

		int contadorPlanetasNorte = 0;
		for (int i = 0; i < systemsPlanets.size(); i++) {
			if (systemsPlanets.get(i).posY > 8) {
				contadorPlanetasNorte++;
			}
		}
		return contadorPlanetasNorte;
	}

	public int checkJAVASouth(ArrayList<Planets> systemsPlanets) {

		int contadorPlanetasSul = 0;
		for (int i = 0; i < systemsPlanets.size(); i++) {
			if (systemsPlanets.get(i).posY < 8) {
				contadorPlanetasSul++;
			}
		}
		return contadorPlanetasSul;
	}

	public int checkJAVALine(ArrayList<Planets> systemsPlanets) {

		int contadorPlanetasAlinhados = 0;
		for (int i = 0; i < systemsPlanets.size(); i++) {
			if (systemsPlanets.get(i).posX == 8 && systemsPlanets.get(i).posY == 8) {
				contadorPlanetasAlinhados++;
			}
		}
		return contadorPlanetasAlinhados;
	}
	
	public void calcularDistEuclidiana() {
		for (int i = 0; i < systemsPlanet.size(); i++) {
			for (int j = i + 1; j < systemsPlanet.size(); j++) {
				Planets planeta1 = systemsPlanet.get(i);
				Planets planeta2 = systemsPlanet.get(j);

				double distEuclidiana = Math
						.sqrt(Math.pow(planeta1.posX - planeta2.posX, 2) + Math.pow(planeta1.posY - planeta2.posY, 2));
				System.out.println(
						"Distância Euclidiana entre " + planeta1.nome + " e " + planeta2.nome + ": " + distEuclidiana);

			}
		}
	}
	

	public ArrayList<Planets> getPlanetas() {
		return systemsPlanet;
	}

	public ArrayList<Bugs> getBugsList() {
		return bugsList;
	}

	public ArrayList<Devs> getDevsList() {
		return devsList;
	}

	
}
