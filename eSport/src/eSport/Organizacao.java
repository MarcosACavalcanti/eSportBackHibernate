package eSport;

import java.util.List;

public class Organizacao {
	
	private Integer id;
	private String nome;
	private Usuario fundador;
	private List<Time> times;
	private List<Campeonato> campeonatos;
	private List<Jogo> jogosAtuantes;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Usuario getFundador() {
		return fundador;
	}
	public void setFundador(Usuario fundador) {
		this.fundador = fundador;
	}
	public List<Time> getTimes() {
		return times;
	}
	public void setTimes(List<Time> times) {
		this.times = times;
	}
	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}
	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
	public List<Jogo> getJogosAtuantes() {
		return jogosAtuantes;
	}
	public void setJogosAtuantes(List<Jogo> jogosAtuantes) {
		this.jogosAtuantes = jogosAtuantes;
	}

}

