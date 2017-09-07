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
	private List<Usuario> membros;
	@Column(name="CAPITAO")
	private Integer capitao;
	//@ManyToOne
	@Transient
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
