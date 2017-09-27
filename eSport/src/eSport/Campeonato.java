package eSport;



import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;



@Entity
@SequenceGenerator(name = "CAMP_SEQ", sequenceName = "CAMPEONATO_SEQ", allocationSize = 1)
public class Campeonato implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4685489328839996782L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CAMP_SEQ")
	private Integer id;
	private String campeonato;
	@OneToOne()
	private Organizacao organizacao_Campeonato;
	private String descricao;
	
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
	public String getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(String campeonato) {
		this.campeonato = campeonato;
	}
	
	


}
