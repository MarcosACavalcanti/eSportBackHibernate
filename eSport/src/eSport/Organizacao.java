package eSport;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "ORG_SEQ", sequenceName = "ORGANIZACAO_SEQ", allocationSize = 1)
public class Organizacao implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2179372676277999397L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORG_SEQ")
	private Integer id;
	private String nome;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="organizacao")
	private List<Time> times;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="organizacao_Campeonato")
	private List<Campeonato> campeonatos;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="jogos_Campeonato")
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