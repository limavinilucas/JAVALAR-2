package controller;

import java.util.ArrayList;

public class DataAnalise {

	public int QuadranteComMaisBugs(ArrayList<String[]> dataBase) {

		int[] qntBugs = new int[4];
		int maxBugs;

		for (int i = 0; i < dataBase.size(); i++) {

			String[] bugsQuads = dataBase.get(i);
			for (int j = 0; j < 4; j++) {
				if (bugsQuads[j + 38] != null) {
					qntBugs[j] = Integer.parseInt(bugsQuads[j + 38]);
				}
			}

		}

		maxBugs = qntBugs[0];

		for (int i = 1; i < qntBugs.length; i++) {

			if (qntBugs[i] > qntBugs[i - 1])
				maxBugs = qntBugs[i];

		}

		return maxBugs;
	}

	public int QuadranteComMaisDevs(ArrayList<String[]> dataBase) {

		int[] devsQnt = new int[4];
		int maxDevs;

		for (int i = 0; i < dataBase.size(); i++) {

			String[] devsQuads = dataBase.get(i);
			for (int j = 0; j < 4; j++) {
				if (devsQuads[j + 42] != null) {
					devsQnt[j] = Integer.parseInt(devsQuads[j + 42]);
				}
			}

		}

		maxDevs = devsQnt[0];

		for (int i = 0; i < devsQnt.length; i++) {

			if (devsQnt[i] > devsQnt[i - 1]) {
				maxDevs = devsQnt[i];
			}

		}

		return maxDevs;
	}

	public int BugsPerPlanet(ArrayList<String[]> dataBase) {

		int[] bugsPlanets = new int[7];
		int maxBugsPlanets;

		for (int i = 0; i < dataBase.size(); i++) {

			String[] bugsQntPlanets = dataBase.get(i);
			for (int j = 0; j < 7; j++) {
				if (bugsQntPlanets[j + 3] != null) {
					bugsPlanets[j] = Integer.parseInt(bugsQntPlanets[j + 3]);
				}
			}

		}

		maxBugsPlanets = bugsPlanets[0];

		for (int i = 0; i < bugsPlanets.length; i++) {

			if (bugsPlanets[i] > bugsPlanets[i - 1]) {
				maxBugsPlanets = bugsPlanets[i];
			}

		}

		return maxBugsPlanets;
	}

	public int DevsPerPlanet(ArrayList<String[]> dataBase) {

		int[] devsPlanets = new int[7];
		int maxDevsPlanets;

		for (int i = 0; i < dataBase.size(); i++) {

			String[] devsQntPlanets = dataBase.get(i);
			for (int j = 0; j < 7; j++) {
				if (devsQntPlanets[j + 10] != null) {
					devsPlanets[j] = Integer.parseInt(devsQntPlanets[j + 10]);
				}
			}

		}

		maxDevsPlanets = devsPlanets[0];

		for (int i = 0; i < devsPlanets.length; i++) {

			if (devsPlanets[i] > devsPlanets[i - 1]) {
				maxDevsPlanets = devsPlanets[i];
			}

		}

		return maxDevsPlanets;
	}

	public int VelocityPlanets(ArrayList<String[]> dataBase) {

		int[] velocityPlanets = new int[4];
		int maxVelocityPlanets;

		for (int i = 0; i < dataBase.size(); i++) {

			String[] velocityPlanetsQnt = dataBase.get(i);
			for (int j = 0; j < 7; j++) {
				if (velocityPlanetsQnt[j + 17] != null) {
					velocityPlanets[j] = Integer.parseInt(velocityPlanetsQnt[17]);
				}
			}

		}

		maxVelocityPlanets = velocityPlanets[0];

		for (int i = 0; i < velocityPlanets.length; i++) {

			if (velocityPlanets[i] > velocityPlanets[i - 1]) {
				maxVelocityPlanets = velocityPlanets[i];
			}

		}

		return maxVelocityPlanets;
	}

	public int daysPlanets(ArrayList<String[]> dataBase) {

		int[] daysPlanets = new int[7];
		int numPlanetsDays;

		for (int i = 0; i < dataBase.size(); i++) {

			String[] daysInPlanets = dataBase.get(i);
			for (int j = 0; j < 7; j++) {
				if (daysInPlanets[j + 24] != null) {
					daysPlanets[j] = Integer.parseInt(daysInPlanets[j + 24]);
				}
			}
		}

		numPlanetsDays = daysPlanets[0];

		for (int i = 0; i < daysPlanets.length; i++) {

			if (daysPlanets[i] > daysPlanets[i + 1]) {
				numPlanetsDays = daysPlanets[i];
			}

		}

		return numPlanetsDays;

	}

	public int YearsPlanets(ArrayList<String[]> dataBase) {

		int[] daysC = new int[7];
		int numPlanetsDays;

		for (int i = 0; i < dataBase.size(); i++) {

			String[] daysInPlanets = dataBase.get(i);
			for (int j = 0; j < 7; j++) {
				if (daysInPlanets[j + 31] != null) {
					daysC[j] = Integer.parseInt(daysInPlanets[j + 31]);
				}
			}
		}

		numPlanetsDays = daysC[0];

		for (int i = 0; i < daysC.length; i++) {

			if (daysC[i] > daysC[i + 1]) {
				numPlanetsDays = daysC[i];
			}

		}

		return numPlanetsDays;

	}
	
	
	

}