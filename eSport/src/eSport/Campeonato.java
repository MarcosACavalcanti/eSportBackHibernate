package eSport;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name = "CAMPEONATO")
@SequenceGenerator(name = "SEQUENCE.CAMPEONATO_ID_SEQ", 
		sequenceName = "CAMPEONATO_ID_SEQ", allocationSize = 0)
public class Campeonato implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4585946173214080193L;
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name="Campeonato")
	private String campeonato;
	@OneToOne()
	private Organizacao organizacao_Campeonato;
	@Column(name="descricao")
	private String descricao;
	@Column(name="jogo")
	private Jogo jogo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(String campeonato) {
		this.campeonato = campeonato;
	}
	
	


}
