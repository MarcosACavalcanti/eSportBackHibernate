package eSport;

import java.util.List;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "TIME")
@SequenceGenerator(name = "SEQUENCE.TIME_ID_SEQ", 
		sequenceName = "TIME_ID_SEQ", allocationSize = 0)

public class Time implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -1159402279176937394L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, 
			generator = "SEQUENCE.TIME_ID_SEQ")
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
