package eSport;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "JOGS_SEQ", sequenceName = "JOGO_SEQ", allocationSize = 1)
public class Jogo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5952509081045666234L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "JOGS_SEQ")
	private Integer id;
	private String nome;
	private String descricao;
	private Integer numeroDeJogadores;
	
	@ManyToOne()
	private Organizacao jogos_Campeonato;
	
	@ManyToOne()
	private Time jogotime;
	
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
	public Integer getNumeroDeJogadores() {
		return numeroDeJogadores;
	}
	public void setNumeroDeJogadores(Integer numeroDeJogadores) {
		this.numeroDeJogadores = numeroDeJogadores;
	}
	
	

}
