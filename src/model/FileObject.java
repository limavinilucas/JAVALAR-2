package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileObject {
	
private static final long serialVersionUID = 1L;
	
	private int Instantes;
	private int Python;
	private int JavaScript;
	private int RubyOnRails;
	private int PHP;
	private int Csharp;
	private int Cmais;
	private int C;
	private int BUG;
	private int DEV;

	public FileObject(int instantes, int python, int javaScript, int rubyOnRails, int php, int csharp, int cmais, int c,
			int bug, int dev) {
		super();
		Instantes = instantes;
		Python = python;
		JavaScript = javaScript;
		RubyOnRails = rubyOnRails;
		PHP = php;
		Csharp = csharp;
		Cmais = cmais;
		C = c;
		BUG = bug;
		DEV = dev;
	}

	public int getInstantes() {
		return Instantes;
	}

	public void setInstantes(int instantes) {
		Instantes = instantes;
	}

	public int getPython() {
		return Python;
	}

	public void setPython(int python) {
		Python = python;
	}

	public int getJavaScript() {
		return JavaScript;
	}

	public void setJavaScript(int javaScript) {
		JavaScript = javaScript;
	}

	public int getRubyOnRails() {
		return RubyOnRails;
	}

	public void setRubyOnRails(int rubyOnRails) {
		RubyOnRails = rubyOnRails;
	}

	public int getPHP() {
		return PHP;
	}

	public void setPHP(int pHP) {
		PHP = pHP;
	}

	public int getCsharp() {
		return Csharp;
	}

	public void setCsharp(int csharp) {
		Csharp = csharp;
	}

	public int getCmais() {
		return Cmais;
	}

	public void setCmais(int cmais) {
		Cmais = cmais;
	}

	public int getC() {
		return C;
	}

	public void setC(int c) {
		C = c;
	}

	public int getBUG() {
		return BUG;
	}

	public void setBUG(int bUG) {
		BUG = bUG;
	}

	public int getDEV() {
		return DEV;
	}

	public void setDEV(int dEV) {
		DEV = dEV;
	}

	@Override
	public String toString() {
		return "Products [Instantes=" + Instantes + ", Python=" + Python + ", JavaScript=" + JavaScript
				+ ", RubyOnRails=" + RubyOnRails + ", PHP=" + PHP + ", Csharp=" + Csharp + ", Cmais=" + Cmais + ", C="
				+ C + ", BUG=" + BUG + ", DEV=" + DEV + "]";
	}
	
}
