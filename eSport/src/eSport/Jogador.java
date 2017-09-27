package eSport;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@NamedQueries({
	@NamedQuery(name="Jogador.findAll",
			query="SELECT c FROM Jogador c ORDER BY c.nome ASC")
	}
)
@SequenceGenerator(name = "JOG_SEQ", sequenceName = "JOGADOR_SEQ", allocationSize = 1)

public class Jogador {
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "JOG_SEQ")
	private Integer id;
	
	@NotBlank
	private String nome;
	private String nomeUsuario;
	private String nomePerfil;
	private String sobrenome;
	private String senha;
	private Integer capdotime;
	
	@OneToOne()
	private Time time;
	@OneToOne()
	private Organizacao timeCapitao;
	@OneToOne()
	private Organizacao organizacao;
	
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
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getNomePerfil() {
		return nomePerfil;
	}
	public void setNomePerfil(String nomePerfil) {
		this.nomePerfil = nomePerfil;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Organizacao getOrganizacao() {
		return organizacao;
	}
	public void setOrganizacao(Organizacao organizacao) {
		this.organizacao = organizacao;
	}
	public Integer getCapdotime() {
		return capdotime;
	}
	public void setCapdotime(Integer capdotime) {
		this.capdotime = capdotime;
	}
	public Organizacao getTimeCapitao() {
		return timeCapitao;
	}
	public void setTimeCapitao(Organizacao timeCapitao) {
		this.timeCapitao = timeCapitao;
	}
	
	

}