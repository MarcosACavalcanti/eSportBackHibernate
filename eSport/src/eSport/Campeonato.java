package eSport;

import java.util.List;

public class Campeonato {
	
	private Integer id;
	private String nome;
	private String descricao;
	private Jogo jogo;
	private List<Time> listaTimesParticipantes;
	private Organizacao organizacao;
	
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Jogo getJogo() {
		return jogo;
	}
	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}
	public List<Time> getListaTimesParticipantes() {
		return listaTimesParticipantes;
	}
	public void setListaTimesParticipantes(List<Time> listaTimesParticipantes) {
		this.listaTimesParticipantes = listaTimesParticipantes;
	}
	public Organizacao getOrganizacao() {
		return organizacao;
	}
	public void setOrganizacao(Organizacao organizacao) {
		this.organizacao = organizacao;
	}

}
