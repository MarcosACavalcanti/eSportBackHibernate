package eSport;

import java.util.List;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.transaction.TransactionScoped;

@Entity
@Table(name = "ORGANIZACAO")
@SequenceGenerator(name = "SEQUENCE.ORGANIZACAO_ID_SEQ", 
		sequenceName = "ORGANIZACAO_ID_SEQ", allocationSize = 0)
public class Organizacao implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, 
			generator = "SEQUENCE.ORGANIZACAO_ID_SEQ")
	private Integer id;
	@Column(name="NOME")
	private String nome;
	//@OneToOne(mappedBy = "organizacao")
	//@Column(name="FUNDADOR")
	private Usuario fundador;
	//@Column(name="Id_Time")
	//private Integer id_Time;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="organizacao")
	private List<Time> times;
	//@OneToMany(cascade = CascadeType.ALL)
	@Transient
	private List<Campeonato> campeonatos;
	//@OneToMany(cascade = CascadeType.ALL)
	@Transient
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