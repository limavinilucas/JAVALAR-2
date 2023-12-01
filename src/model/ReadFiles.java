package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;

public class ReadFiles {

	String[] valores;
	List<FileObject> list = new ArrayList<>();
	List<List<String>> listAll = new ArrayList<>();
	List<String> listInstantes = new ArrayList<>();
	List<String> listPython = new ArrayList<>();
	List<String> listJS = new ArrayList<>();
	List<String> listRuby = new ArrayList<>();
	List<String> listPHP = new ArrayList<>();
	List<String> listCsp = new ArrayList<>();
	List<String> listCplus = new ArrayList<>();
	List<String> listC = new ArrayList<>();
	List<String> listBugs = new ArrayList<>();
	List<String> listDevs = new ArrayList<>();

	public List<FileObject> getObjectList() {

		JFileChooser janelaSelecao = new JFileChooser();
		int verificacao = janelaSelecao.showOpenDialog(null);

		if (verificacao == JFileChooser.APPROVE_OPTION) {

			File pathFile = janelaSelecao.getSelectedFile();
			String selectedFile = pathFile.getAbsolutePath();

			try (BufferedReader br = new BufferedReader(new FileReader(selectedFile))) {
				String line = br.readLine();
				line = br.readLine();

				while (line != null) {

					valores = line.split(",");

					int instantes = Integer.parseInt(valores[0]);
					int python = Integer.parseInt(valores[1]);
					int javaScript = Integer.parseInt(valores[2]);
					int rubyOnRails = Integer.parseInt(valores[3]);
					int php = Integer.parseInt(valores[4]);
					int csharp = Integer.parseInt(valores[5]);
					int cmais = Integer.parseInt(valores[6]);
					int c = Integer.parseInt(valores[7]);
					int bug = Integer.parseInt(valores[8]);
					int dev = Integer.parseInt(valores[9]);

					FileObject objectFiles = new FileObject(instantes, python, javaScript, rubyOnRails, php, csharp,
							cmais, c, bug, dev);
					objectFiles = new FileObject(instantes, python, javaScript, rubyOnRails, php, csharp, cmais, c, bug,
							dev);

					listInstantes.add(valores[0]);
					listPython.add(valores[1]);
					listJS.add(valores[2]);
					listRuby.add(valores[3]);
					listPHP.add(valores[4]);
					listCsp.add(valores[5]);
					listCplus.add(valores[6]);
					listC.add(valores[7]);
					listBugs.add(valores[8]);
					listDevs.add(valores[9]);

					list.add(objectFiles);
					line = br.readLine();
				}

//				System.out.println("     - VALORES -     ");
//				for (FileObject fileObject : list) {
//					System.out.println(fileObject.toString());
//				}

			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}

		return list;

	}

	public List<Integer> getIntListInstante() {

		List<Integer> intListInstantes = new ArrayList<>();
		for (String valor : listInstantes) {
			int intValor = Integer.parseInt(valor);
			intListInstantes.add(intValor);
		}

//		for (int j = 0; j < intListInstantes.size(); j++) {
//		}
		System.out.println(intListInstantes.get(7));
//		for (int valor : intListInstantes) {
//			System.out.println(valor);
//		}

		return intListInstantes;

	}

	public List<Integer> getIntListPython() {

		List<Integer> intListPython = new ArrayList<>();
		for (String valor : listPython) {
			int intValor = Integer.parseInt(valor);
			intListPython.add(intValor);
		}
		System.out.println(intListPython.get(7));
		return intListPython;

	}

	public List<Integer> getIntListJS() {

		List<Integer> intListJS = new ArrayList<>();
		for (String valor : listJS) {
			int intValor = Integer.parseInt(valor);
			intListJS.add(intValor);
		}
		System.out.println(intListJS.get(7));
		return intListJS;

	}

	public List<Integer> getIntListRuby() {

		List<Integer> intListRuby = new ArrayList<>();
		for (String valor : listRuby) {
			int intValor = Integer.parseInt(valor);
			intListRuby.add(intValor);
		}
		System.out.println(intListRuby.get(7));
		return intListRuby;

	}

	public List<Integer> getIntListPHP() {

		List<Integer> intListPHP = new ArrayList<>();
		for (String valor : listPHP) {
			int intValor = Integer.parseInt(valor);
			intListPHP.add(intValor);
		}
		System.out.println(intListPHP.get(7));

		return intListPHP;

	}

	public List<Integer> getIntListCsp() {

		List<Integer> intListCsp = new ArrayList<>();
		for (String valor : listCsp) {
			int intValor = Integer.parseInt(valor);
			intListCsp.add(intValor);
		}
		System.out.println(intListCsp.get(7));

		return intListCsp;

	}

	public List<Integer> getIntListCplus() {

		List<Integer> intListCplus = new ArrayList<>();
		for (String valor : listCplus) {
			int intValor = Integer.parseInt(valor);
			intListCplus.add(intValor);
		}
		System.out.println(intListCplus.get(7));

		return intListCplus;

	}

	public List<Integer> getIntListC() {

		List<Integer> intListC = new ArrayList<>();
		for (String valor : listC) {
			int intValor = Integer.parseInt(valor);
			intListC.add(intValor);
		}
		System.out.println(intListC.get(7));

		return intListC;

	}

	public List<Integer> getIntListBugs() {

		List<Integer> intListBugs = new ArrayList<>();
		for (String valor : listBugs) {
			int intValor = Integer.parseInt(valor);
			intListBugs.add(intValor);
		}
		System.out.println(intListBugs.get(7));

		return intListBugs;

	}

	public List<Integer> getIntListDevs() {

		List<Integer> intListDevs = new ArrayList<>();
		for (String valor : listDevs) {
			int intValor = Integer.parseInt(valor);
			intListDevs.add(intValor);
		}
		System.out.println(intListDevs.get(7));

		return intListDevs;

	}

	public int getValueInst(int indice) {
		List<Integer> intListInstantes = getIntListInstante();

		if (indice >= 0 && indice < intListInstantes.size()) {
			return intListInstantes.get(indice);
		} else {
			throw new IllegalArgumentException("Índice inválido.");
		}
	}

	public int getValuePython(int indice) {
		List<Integer> intListPython = getIntListPython();

		if (indice >= 0 && indice < intListPython.size()) {
			return intListPython.get(indice);
		} else {
			throw new IllegalArgumentException("Índice inválido.");
		}
	}

	public int getValueJS(int indice) {
		List<Integer> intListJS = getIntListJS();

		if (indice >= 0 && indice < intListJS.size()) {
			return intListJS.get(indice);
		} else {
			throw new IllegalArgumentException("Índice inválido.");
		}
	}

	public int getValueRuby(int indice) {
		List<Integer> intListRuby = getIntListRuby();

		if (indice >= 0 && indice < intListRuby.size()) {
			return intListRuby.get(indice);
		} else {
			throw new IllegalArgumentException("Índice inválido.");
		}
	}

	public int getValuePHP(int indice) {
		List<Integer> intListPHP = getIntListPHP();

		if (indice >= 0 && indice < intListPHP.size()) {
			return intListPHP.get(indice);
		} else {
			throw new IllegalArgumentException("Índice inválido.");
		}
	}

	public int getValueCsp(int indice) {
		List<Integer> intListCsp = getIntListCsp();

		if (indice >= 0 && indice < intListCsp.size()) {
			return intListCsp.get(indice);
		} else {
			throw new IllegalArgumentException("Índice inválido.");
		}
	}

	public int getValueCplus(int indice) {
		List<Integer> intListCplus = getIntListCplus();

		if (indice >= 0 && indice < intListCplus.size()) {
			return intListCplus.get(indice);
		} else {
			throw new IllegalArgumentException("Índice inválido.");
		}
	}

	public int getValueC(int indice) {
		List<Integer> intListC = getIntListC();

		if (indice >= 0 && indice < intListC.size()) {
			return intListC.get(indice);
		} else {
			throw new IllegalArgumentException("Índice inválido.");
		}
	}

	public int getValueBugs() {
		List<Integer> intListBugs = getIntListBugs();
		int sum = 0;
		for (Integer integer : intListBugs) {
			sum += integer;
		}
		return sum;
	}

	public int getValueDevs() {
		List<Integer> intListDevs = getIntListDevs();
		int sum = 0;
		for (Integer integer : intListDevs) {
			sum += integer;
		}
		
		return sum;
		
	}

}
