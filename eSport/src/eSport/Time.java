package eSport;

import java.util.List;

public class Time {
	
	private Integer id;
	private Organizacao organizacao;
	private List<Usuario> membros;
	private Integer capitao;
	private Jogo jogo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Organizacao getOrganizacao() {
		return organizacao;
	}
	public void setOrganizacao(Organizacao organizacao) {
		this.organizacao = organizacao;
	}
	public List<Usuario> getMembros() {
		return membros;
	}
	public void setMembros(List<Usuario> membros) {
		this.membros = membros;
	}
	public Jogo getJogo() {
		return jogo;
	}
	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

}
