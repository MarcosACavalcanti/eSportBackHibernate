package eSport;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "JOGO")
@SequenceGenerator(name = "SEQUENCE.JOGO_ID_SEQ", 
		sequenceName = "JOGO_ID_SEQ", allocationSize = 0)
public class Jogo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -938962287227445106L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, 
	generator = "SEQUENCE.JOGO_ID_SEQ")
	private Integer id;
	@Column(name="NOME")
	private String nome;
	@Column(name="DESCRICAO")
	private String descricao;
	@Column(name="NUMERODEJOGADORES")
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
