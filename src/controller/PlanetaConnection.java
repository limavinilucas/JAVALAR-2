package controller;

import dao.PLANETAdao;

public class PlanetaConnection {
	private String nome;
	private int matricula;
	private String nome_arquivo;
	
	private int bug_python;
	private int bug_javascript;
	private int bug_ruby;
	private int bug_php;
	private int bug_csharp;
	private int bug_cmais;
	private int bug_c;
	
	private int dev_python;
	private int dev_javascript;
	private int dev_ruby;
	private int dev_php;
	private int dev_csharp;
	private int dev_cmais;
	private int dev_c;
	
	private int v_python;
	private int v_javascript;
	private int v_ruby;
	private int v_php;
	private int v_csharp;
	private int v_cmais;
	private int v_c;
	
	private int d_python;
	private int d_javascript;
	private int d_ruby;
	private int d_php;
	private int d_csharp;
	private int d_cmais;
	private int d_c;
	
	private int a_python;
	private int a_javascript;
	private int a_ruby;
	private int a_php;
	private int a_csharp;
	private int a_cmais;
	private int a_c;
	
	private int bug_q1;
	private int bug_q2;
	private int bug_q3;
	private int bug_q4;
	
	private int dev_q1;
	private int dev_q2;
	private int dev_q3;
	private int dev_q4;

	private	PLANETAdao planetDAO;
	
	public PlanetaConnection(String nome, int matricula, String nome_arquivo, int bug_python, int bug_javascript,
			int bug_ruby, int bug_php, int bug_csharp, int bug_cmais, int bug_c, int dev_python, int dev_javascript,
			int dev_ruby, int dev_php, int dev_csharp, int dev_cmais, int dev_c, int v_python, int v_javascript,
			int v_ruby, int v_php, int v_csharp, int v_cmais, int v_c, int d_python, int d_javascript, int d_ruby,
			int d_php, int d_csharp, int d_cmais, int d_c, int a_python, int a_javascript, int a_ruby, int a_php,
			int a_csharp, int a_cmais, int a_c, int bug_q1, int bug_q2, int bug_q3, int bug_q4, int dev_q1,
			int dev_q2, int dev_q3, int dev_q4) {
		super();
		
		
		this.planetDAO = new PLANETAdao();
		this.nome = nome;
		this.matricula = matricula;
		this.nome_arquivo = nome_arquivo;
		this.bug_python = bug_python;
		this.bug_javascript = bug_javascript;
		this.bug_ruby = bug_ruby;
		this.bug_php = bug_php;
		this.bug_csharp = bug_csharp;
		this.bug_cmais = bug_cmais;
		this.bug_c = bug_c;
		this.dev_python = dev_python;
		this.dev_javascript = dev_javascript;
		this.dev_ruby = dev_ruby;
		this.dev_php = dev_php;
		this.dev_csharp = dev_csharp;
		this.dev_cmais = dev_cmais;
		this.dev_c = dev_c;
		this.v_python = v_python;
		this.v_javascript = v_javascript;
		this.v_ruby = v_ruby;
		this.v_php = v_php;
		this.v_csharp = v_csharp;
		this.v_cmais = v_cmais;
		this.v_c = v_c;
		this.d_python = d_python;
		this.d_javascript = d_javascript;
		this.d_ruby = d_ruby;
		this.d_php = d_php;
		this.d_csharp = d_csharp;
		this.d_cmais = d_cmais;
		this.d_c = d_c;
		this.a_python = a_python;
		this.a_javascript = a_javascript;
		this.a_ruby = a_ruby;
		this.a_php = a_php;
		this.a_csharp = a_csharp;
		this.a_cmais = a_cmais;
		this.a_c = a_c;
		this.bug_q1 = bug_q1;
		this.bug_q2 = bug_q2;
		this.bug_q3 = bug_q3;
		this.bug_q4 = bug_q4;
		this.dev_q1 = dev_q1;
		this.dev_q2 = dev_q2;
		this.dev_q3 = dev_q3;
		this.dev_q4 = dev_q4;
	}

	public void insertPlanet(PlanetaConnection planetaConnectar) throws ClassNotFoundException {
		planetDAO.registroDePlanetas(planetaConnectar);
	};

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome_arquivo() {
		return nome_arquivo;
	}
	public void setNome_arquivo(String nome_arquivo) {
		this.nome_arquivo = nome_arquivo;
	}
	public int getBug_python() {
		return bug_python;
	}
	public void setBug_python(int bug_python) {
		this.bug_python = bug_python;
	}
	public int getBug_javascript() {
		return bug_javascript;
	}
	public void setBug_javascript(int bug_javascript) {
		this.bug_javascript = bug_javascript;
	}
	public int getBug_ruby() {
		return bug_ruby;
	}
	public void setBug_ruby(int bug_ruby) {
		this.bug_ruby = bug_ruby;
	}
	public int getBug_php() {
		return bug_php;
	}
	public void setBug_php(int bug_php) {
		this.bug_php = bug_php;
	}
	public int getBug_csharp() {
		return bug_csharp;
	}
	public void setBug_csharp(int bug_csharp) {
		this.bug_csharp = bug_csharp;
	}
	public int getBug_cmais() {
		return bug_cmais;
	}
	public void setBug_cmais(int bug_cmais) {
		this.bug_cmais = bug_cmais;
	}
	public int getBug_c() {
		return bug_c;
	}
	public void setBug_c(int bug_c) {
		this.bug_c = bug_c;
	}
	public int getDev_python() {
		return dev_python;
	}
	public void setDev_python(int dev_python) {
		this.dev_python = dev_python;
	}
	public int getDev_javascript() {
		return dev_javascript;
	}
	public void setDev_javascript(int dev_javascript) {
		this.dev_javascript = dev_javascript;
	}
	public int getDev_ruby() {
		return dev_ruby;
	}
	public void setDev_ruby(int dev_ruby) {
		this.dev_ruby = dev_ruby;
	}
	public int getDev_php() {
		return dev_php;
	}
	public void setDev_php(int dev_php) {
		this.dev_php = dev_php;
	}
	public int getDev_csharp() {
		return dev_csharp;
	}
	public void setDev_csharp(int dev_csharp) {
		this.dev_csharp = dev_csharp;
	}
	public int getDev_cmais() {
		return dev_cmais;
	}
	public void setDev_cmais(int dev_cmais) {
		this.dev_cmais = dev_cmais;
	}
	public int getDev_c() {
		return dev_c;
	}
	public void setDev_c(int dev_c) {
		this.dev_c = dev_c;
	}
	public int getV_python() {
		return v_python;
	}
	public void setV_python(int v_python) {
		this.v_python = v_python;
	}
	public int getV_javascript() {
		return v_javascript;
	}
	public void setV_javascript(int v_javascript) {
		this.v_javascript = v_javascript;
	}
	public int getV_ruby() {
		return v_ruby;
	}
	public void setV_ruby(int v_ruby) {
		this.v_ruby = v_ruby;
	}
	public int getV_php() {
		return v_php;
	}
	public void setV_php(int v_php) {
		this.v_php = v_php;
	}
	public int getV_csharp() {
		return v_csharp;
	}
	public void setV_csharp(int v_csharp) {
		this.v_csharp = v_csharp;
	}
	public int getV_cmais() {
		return v_cmais;
	}
	public void setV_cmais(int v_cmais) {
		this.v_cmais = v_cmais;
	}
	public int getV_c() {
		return v_c;
	}
	public void setV_c(int v_c) {
		this.v_c = v_c;
	}
	public int getD_python() {
		return d_python;
	}
	public void setD_python(int d_python) {
		this.d_python = d_python;
	}
	public int getD_javascript() {
		return d_javascript;
	}
	public void setD_javascript(int d_javascript) {
		this.d_javascript = d_javascript;
	}
	public int getD_ruby() {
		return d_ruby;
	}
	public void setD_ruby(int d_ruby) {
		this.d_ruby = d_ruby;
	}
	public int getD_php() {
		return d_php;
	}
	public void setD_php(int d_php) {
		this.d_php = d_php;
	}
	public int getD_csharp() {
		return d_csharp;
	}
	public void setD_csharp(int d_csharp) {
		this.d_csharp = d_csharp;
	}
	public int getD_cmais() {
		return d_cmais;
	}
	public void setD_cmais(int d_cmais) {
		this.d_cmais = d_cmais;
	}
	public int getD_c() {
		return d_c;
	}
	public void setD_c(int d_c) {
		this.d_c = d_c;
	}
	public int getA_python() {
		return a_python;
	}
	public void setA_python(int a_python) {
		this.a_python = a_python;
	}
	public int getA_javascript() {
		return a_javascript;
	}
	public void setA_javascript(int a_javascript) {
		this.a_javascript = a_javascript;
	}
	public int getA_ruby() {
		return a_ruby;
	}
	public void setA_ruby(int a_ruby) {
		this.a_ruby = a_ruby;
	}
	public int getA_php() {
		return a_php;
	}
	public void setA_php(int a_php) {
		this.a_php = a_php;
	}
	public int getA_csharp() {
		return a_csharp;
	}
	public void setA_csharp(int a_csharp) {
		this.a_csharp = a_csharp;
	}
	public int getA_cmais() {
		return a_cmais;
	}
	public void setA_cmais(int a_cmais) {
		this.a_cmais = a_cmais;
	}
	public int getA_c() {
		return a_c;
	}
	public void setA_c(int a_c) {
		this.a_c = a_c;
	}
	public int getBug_q1() {
		return bug_q1;
	}
	public void setBug_q1(int bug_q1) {
		this.bug_q1 = bug_q1;
	}
	public int getBug_q2() {
		return bug_q2;
	}
	public void setBug_q2(int bug_q2) {
		this.bug_q2 = bug_q2;
	}
	public int getBug_q3() {
		return bug_q3;
	}
	public void setBug_q3(int bug_q3) {
		this.bug_q3 = bug_q3;
	}
	public int getBug_q4() {
		return bug_q4;
	}
	public void setBug_q4(int bug_q4) {
		this.bug_q4 = bug_q4;
	}
	public int getDev_q1() {
		return dev_q1;
	}
	public void setDev_q1(int dev_q1) {
		this.dev_q1 = dev_q1;
	}
	public int getDev_q2() {
		return dev_q2;
	}
	public void setDev_q2(int dev_q2) {
		this.dev_q2 = dev_q2;
	}
	public int getDev_q3() {
		return dev_q3;
	}
	public void setDev_q3(int dev_q3) {
		this.dev_q3 = dev_q3;
	}
	public int getDev_q4() {
		return dev_q4;
	}
	public void setDev_q4(int dev_q4) {
		this.dev_q4 = dev_q4;
	}
	
}