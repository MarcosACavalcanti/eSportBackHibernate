package eSport;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "TIM_SEQ", sequenceName = "TIME_SEQ", allocationSize = 1)

public class Time implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5636002986937000166L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TIM_SEQ")
	private Integer id;
	@ManyToOne
	private Organizacao organizacao;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="time")
	private List<Jogador> membros;
	@OneToOne(cascade=CascadeType.ALL,mappedBy="timeCapitao")
	private Jogador capitao;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="jogotime")
	private List<Jogo> jogotime;
	
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
	public List<Jogador> getMembros() {
		return membros;
	}
	public void setMembros(List<Jogador> membros) {
		this.membros = membros;
	}
	public Jogador getCapitao() {
		return capitao;
	}
	public void setCapitao(Jogador capitao) {
		this.capitao = capitao;
	}
	public List<Jogo> getJogotime() {
		return jogotime;
	}
	public void setJogotime(List<Jogo> jogotime) {
		this.jogotime = jogotime;
	}


}
